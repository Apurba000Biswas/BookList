package com.example.apurba.booklist.booklist;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private String googleBookRequestUrl = "https://www.googleapis.com/books/v1/volumes?q=";
    private booksAdapater mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.plain_text_input);
        final TextView textView  = findViewById(R.id.textfield);

        List<BookInfo> books =  new ArrayList<BookInfo>();
        ListView booksListView = (ListView) findViewById(R.id.list);
        mAdapter = new booksAdapater(this, books);
        booksListView.setAdapter(mAdapter);



        Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String givenText = editText.getText().toString();
                textView.setText(givenText);

                bookLoadingAsyncTask task = new bookLoadingAsyncTask();
                updateRequestUrl(givenText, textView);
                task.execute(googleBookRequestUrl);
            }
        });
    }

    private void updateRequestUrl(String input, TextView textView){

        googleBookRequestUrl =googleBookRequestUrl + input + "&maxResults=20";
        textView.setText(googleBookRequestUrl);
    }

    private class bookLoadingAsyncTask extends AsyncTask<String, Void, List<BookInfo>> {
        @Override
        protected List<BookInfo> doInBackground(String... urls) {
            if (urls.length < 1 || urls[0] == null) {
                return null;
            }

            List<BookInfo> result = QueryUtils.fetchBooksData(urls[0]);
            return result;
        }

        @Override
        protected void onPostExecute(List<BookInfo> bookInfos) {
            mAdapter.clear();

            if (bookInfos != null && !bookInfos.isEmpty()) {
                mAdapter.addAll(bookInfos);
            }
            googleBookRequestUrl = "https://www.googleapis.com/books/v1/volumes?q=";
        }
    }

}
