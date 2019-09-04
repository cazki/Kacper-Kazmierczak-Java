package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        //Given
        Library library = new Library("My Library");
        Book book1 = new Book("exampleTitle 1", "exampleAuthor 1", LocalDate.of(2001, Month.OCTOBER, 15));
        Book book2 = new Book("exampleTitle 2", "exampleAuthor 2", LocalDate.of(2012, Month.DECEMBER, 12));
        Book book3 = new Book("exampleTitle 3", "exampleAuthor 3", LocalDate.of(2003, Month.FEBRUARY, 20));
        Book book4 = new Book("exampleTitle 4", "exampleAuthor 2", LocalDate.of(2014, Month.AUGUST, 10));

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("My Library - shallow copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("My Library - deep copy");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //When
        library.removeBook(book4);

        //Then
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
    }
}