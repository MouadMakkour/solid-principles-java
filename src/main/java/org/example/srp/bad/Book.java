package org.example.srp.bad;

import java.io.FileWriter;
import java.io.IOException;

/*
    Here, the Book class has two responsibilities:

    1 - Storing book data and printing its details.
    2 - Saving the book details to a file.

    This violates SRP because if file handling logic changes
     (e.g., saving to a database instead of a file, or to a pdf),
     we will need to modify the Book class, which should only deal with book data.
 */
public class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //print book details
    public void printDetails(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }

    //save data to a file
    public void saveToFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write("Title: "+title+"\n");
        writer.write("Author: "+author+"\n");
        writer.close();
    }
}
