package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Book;
import com.xworkz.Inheritence.internal.Novel;

public class BookRunner {
    public static void main(String[]args) {
        Book book = new Book();
        book.edit();
        book.publish();
        book.read();
        book.rewrite();
        book.write();
        System.out.println("--------------------------------");

        Book book1 = new Novel();
        book1.edit();
        book1.publish();
        book1.read();
        book1.rewrite();
        book1.write();
        System.out.println("--------------------------------");

        Book book2 = new Novel();
        book2.edit();
        book2.publish();
        book2.read();
        book2.rewrite();
        book2.write();
        System.out.println("--------------------------------");

        Book book3 = new Novel();
        book3.edit();
        book3.publish();
        book3.read();
        book3.rewrite();
        book3.write();
        System.out.println("--------------------------------");


    }

}
