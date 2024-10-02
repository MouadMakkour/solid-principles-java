package org.example.srp.good;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

// Class to handle saving a book to a pdf file (Single Responsibility: File pdf management)

public class BookPdfManager {

    public void saveToPdf(Book book, String filename) throws DocumentException, IOException {
        // Create a new PDF document
        Document document = new Document();

        // Initialize the PdfWriter to write to the file
        PdfWriter.getInstance(document, new FileOutputStream(filename));

        // Open the document for writing
        document.open();

        // Add content to the PDF (book details)
        document.add(new Paragraph("Title: " + book.getTitle()));
        document.add(new Paragraph("Author: " + book.getAuthor()));

        // Close the document after writing
        document.close();

        System.out.println("PDF saved successfully!");
    }
}

