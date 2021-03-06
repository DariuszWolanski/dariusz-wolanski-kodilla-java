package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {
    // lists books having title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    // list books borrowed by libraryUser - wypożyczanie ksiązki
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    // try to rent a book for libraryUser - próba wypożyczenia ksiązki
    // returns true when success
    // and returns false when book is unavailable to rent
    boolean rentABook(LibraryUser libraryUser, Book book);

    // return all books borrowed by libraryUser to the library
    // returns number of books returned back - książki zwrócone przez użytkownika
    int returnBooks(LibraryUser libraryUser);
}
