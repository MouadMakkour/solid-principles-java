package org.example.srp.good;

// Class to handle printing a book's details (Single Responsibility: Printing)
public class BookPrinter {
    public void print(Book book) {
        System.out.println("Title: " + book.getTitle());
        System.out.println("Author: " + book.getAuthor());
    }
}