package org.example.srp.good;

import java.io.FileWriter;
import java.io.IOException;

// Class to handle saving a book to a txt file (Single Responsibility: File management)
public class BookTxtFileManager {
    public void saveToFile(Book book, String filename) throws IOException {
        FileWriter writer = new FileWriter(filename);
        writer.write("Title: " + book.getTitle() + "\n");
        writer.write("Author: " + book.getAuthor() + "\n");
        writer.close();
        System.out.println("file saved successfully!");
    }
}
