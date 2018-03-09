package com.example.apurba.booklist.booklist;

/*
 * Created by Apurba on 3/9/2018.
 */

public class BookInfo {

    private String mTittle;
    private String mAuthor;

    public BookInfo(String tittle, String author){
        mTittle = tittle;
        mAuthor = author;
    }

    public String getTittle(){
        return mTittle;
    }
    public String getAuthor(){
        return mAuthor;
    }
}
