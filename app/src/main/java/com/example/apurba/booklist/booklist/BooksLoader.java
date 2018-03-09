package com.example.apurba.booklist.booklist;

/*
 * Created by Apurba on 3/9/2018.
 */

import android.support.v4.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

public class BooksLoader extends AsyncTaskLoader<List<BookInfo>>{
    public static final String LOG_TAG = BooksLoader.class.getSimpleName();

    private String mUrl;

    public BooksLoader(Context context, String url){
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<BookInfo> loadInBackground() {
        if (mUrl.length()<1){
            return null;
        }
        List<BookInfo> bookList = QueryUtils.fetchBooksData(mUrl);
        return bookList;
    }
}
