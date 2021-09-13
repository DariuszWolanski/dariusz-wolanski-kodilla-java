package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        for (Book books : bookList) {
            if (books.getTitle().contains(titleFragment)) {
                bookList.add(books);
            }
        }
        System.out.println(bookList.size());
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookListBorrowed = new ArrayList<Book>();


        return bookListBorrowed;
    }
}
