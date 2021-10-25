package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    /*
    Przetestuj metodę listBooksInHandsOf(LibraryUser libraryUser) z klasy BookLibrary w różnych scenariuszach:

        - gdy użytkownik nie ma wypożyczonych żadnych książek,
        - gdy ma wypożyczoną jedną książkę,
        - gdy ma wypożyczonych 5 książek.
    Zadanie zrealizuj w podejściu TDD.
     */

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookListBorrowed = new ArrayList<Book>();


        return bookListBorrowed;
    }
}
