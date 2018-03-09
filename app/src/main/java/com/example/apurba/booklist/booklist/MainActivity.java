package com.example.apurba.booklist.booklist;

import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<List<BookInfo>>{

    private static final String GOOGLE_BOOK_REQUEST_URL = "https://www.googleapis.com/books/v1/volumes?q=flowers+inauthor:keyes&AIzaSyA3Y-kastM6XNrI6YGZ8F6_X6ikpXE2Au4";
    private booksAdapater mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.plain_text_input);
        final TextView textView  = findViewById(R.id.textfield);

        final List<BookInfo> books =  new ArrayList<BookInfo>();


        ListView booksListView = (ListView) findViewById(R.id.list);
        mAdapter = new booksAdapater(this, books);
        booksListView.setAdapter(mAdapter);

        final LoaderManager loaderManager = getSupportLoaderManager();

        Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String givenText = editText.getText().toString();
                textView.setText(givenText);

                loaderManager.initLoader(0, null, MainActivity.this).forceLoad();
            }
        });
    }

    @Override
    public Loader<List<BookInfo>> onCreateLoader(int i, Bundle bundle) {
        return new BooksLoader(this, GOOGLE_BOOK_REQUEST_URL);
    }

    @Override
    public void onLoadFinished(Loader<List<BookInfo>> loader, List<BookInfo> books) {

        mAdapter.clear();

        // If there is a valid list of {@link book}s, then add them to the adapter's
        // data set. This will trigger the ListView to update.
        if (books != null && !books.isEmpty()) {
            mAdapter.addAll(books);
        }
    }

    @Override
    public void onLoaderReset(Loader<List<BookInfo>> loader) {
        mAdapter.clear();
    }
}
