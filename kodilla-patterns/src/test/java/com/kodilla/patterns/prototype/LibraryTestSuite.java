package com.kodilla.patterns.prototype;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {

        //Given
        Library library = new Library("Library");

        Book book1 = new Book("W pustyni w puszczy", "Henryk Sienkiewicz", LocalDate.of(2000,12,15));
        Book book2 = new Book("Lalka", "Henryk Sienkiewicz", LocalDate.of(2001,10,5));
        Book book3 = new Book("Czysty kod", "Robert C. Martin", LocalDate.of(2015,8,10));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //making a shallow copy of object library
        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.getName("LibraryClone - shadow copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.getName("LibraryClone - deep copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(3, deepClonedLibrary.getBooks().size());

    }
}

