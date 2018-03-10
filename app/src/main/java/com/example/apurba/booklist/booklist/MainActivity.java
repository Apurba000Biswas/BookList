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
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //input field
        final EditText editText = findViewById(R.id.plain_text_input);
        textView  = findViewById(R.id.textfield);

        List<BookInfo> books =  new ArrayList<BookInfo>();
        ListView booksListView = (ListView) findViewById(R.id.list);
        mAdapter = new booksAdapater(this, books);
        booksListView.setAdapter(mAdapter);

        Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String givenText = editText.getText().toString();

                loadBooks(givenText);

            }
        });
    }
    /* when user clicks the search button to search this method
     * gets triggered and laod books using asynck task
     */
    private void loadBooks(String input){
        if(!input.equals("")){
            bookLoadingAsyncTask task = new bookLoadingAsyncTask();
            googleBookRequestUrl =googleBookRequestUrl + input + "&maxResults=20";
            textView.setText(googleBookRequestUrl);
            task.execute(googleBookRequestUrl);
            googleBookRequestUrl = "https://www.googleapis.com/books/v1/volumes?q=";
        }else{
            textView.setText("Bad input");
        }
    }

    /* This class creates an async task to load books from the requested url
     * in the background thread
     */
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
