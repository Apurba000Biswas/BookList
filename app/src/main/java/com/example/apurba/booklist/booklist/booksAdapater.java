package com.example.apurba.booklist.booklist;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/*
 * Created by Apurba on 3/9/2018.
 */

public class booksAdapater extends ArrayAdapter<BookInfo>{

    public booksAdapater(Activity context, List<BookInfo> books){
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listBooksInfoView = convertView;
        if(listBooksInfoView == null) {
            listBooksInfoView = LayoutInflater.from(getContext()).inflate(R.layout.list_book_info, parent, false);
        }
        BookInfo currentBook = getItem(position);//get the current item to create view
        setAllViews(currentBook, listBooksInfoView);
        return listBooksInfoView;
    }

    private void setAllViews(BookInfo currentBook, View listBooksInfoView){
        TextView tittleTextView = listBooksInfoView.findViewById(R.id.tittle);
        tittleTextView.setText(currentBook.getTittle());

        TextView authorTextView = listBooksInfoView.findViewById(R.id.author);
        authorTextView.setText(currentBook.getAuthor());
    }
}
