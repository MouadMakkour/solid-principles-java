package org.example;

import com.itextpdf.text.DocumentException;
import org.example.dip.good.ConsoleLogger;
import org.example.dip.good.FileLogger;
import org.example.dip.good.Logger;
import org.example.dip.good.UserService;
import org.example.ocp.good.*;
import org.example.srp.good.Book;
import org.example.srp.good.BookTxtFileManager;
import org.example.srp.good.BookPdfManager;
import org.example.srp.good.BookPrinter;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, DocumentException {
        //--------------------SRP--------------------------------------------
        //bad
        /*
            Book bookBad = new Book("bad code","junior dev");
            bookBad.printDetails();
            bookBad.saveToFile("D:\\bad code.txt");
        */

        //good
        Book bookGood = new Book("good code", "senior dev");
        BookPrinter bookPrinter = new BookPrinter();
        BookTxtFileManager bookFileManager = new BookTxtFileManager();
        bookPrinter.print(bookGood);
        bookFileManager.saveToFile(bookGood,"D:\\clean code.txt");

        //Instead of modifying the BookFileManager to handle both text files and PDFs
        // (which would violate SRP),
        // we will introduce a new class responsible for handling PDF-related tasks.
        BookPdfManager bookPdfManager = new BookPdfManager();
        bookPdfManager.saveToPdf(bookGood, "D:\\clean code.pdf");
        //-------------------------------SRP END --------------------------------

        System.out.println("--------------------------ocp----------------------");
        //---------------------------------OCP-------------------------------------
        //bad
        /*
        PaymentProcessor paymentProcessor = new PaymentProcessor();
        paymentProcessor.processPayment("CREDIT_CARD");
         */

        //good
        PaymentProcessor paymentProcessor = new PaymentProcessor();

        // Processing credit card payment
        PaymentMethod creditCardPayment = new CreditCardPayment();
        paymentProcessor.processPayment(creditCardPayment);

        // Processing PayPal payment
        PaymentMethod payPalPayment = new PayPalPayment();
        paymentProcessor.processPayment(payPalPayment);

        // Processing Google Pay payment
        PaymentMethod googlePayPayment = new GooglePayPayment();
        paymentProcessor.processPayment(googlePayPayment);
        //----------------------------OCP END------------------------------

        //----------------------------DIP-----------------------------
        System.out.println("-----------------------DIP-------------------");
        //bad
        /*
            UserService userService = new UserService();
            userService.registerUser("MouAd");
         */
        //good

        // Inject a ConsoleLogger or FileLogger
        Logger consoleLogger = new ConsoleLogger();
        UserService userService = new UserService(consoleLogger);

        userService.registerUser("mouad");

        UserService userService1 = new UserService(new FileLogger());
        userService1.registerUser("Ahmed");
        //----------------------DIP END-----------------------------------
    }
}