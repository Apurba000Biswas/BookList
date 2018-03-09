package com.example.apurba.booklist.booklist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = findViewById(R.id.plain_text_input);
        final TextView textView  = findViewById(R.id.textfield);

        final List<BookInfo> books =  QueryUtils.extractFeatureFromJson();
       /* books.add(new BookInfo("Harry potter and the philosopher stone","J.K.R"));
        books.add(new BookInfo("Harry potter and the prisoner of ajkaban","J.K.R"));
        books.add(new BookInfo("Harry potter and the chambar of secrets","J.K.R"));
        books.add(new BookInfo("Harry potter and the order of phonix","J.K.R"));
        */

        ListView booksListView = (ListView) findViewById(R.id.list);
        booksAdapater mAdapter = new booksAdapater(this, books);
        booksListView.setAdapter(mAdapter);

        Button button = findViewById(R.id.button_id);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String givenText = editText.getText().toString();
                textView.setText(givenText);
            }
        });
    }


}
