package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.Casting.BooksCast;
import com.xworkz.Inheritence.External.Books;
import com.xworkz.Inheritence.internal.Classmate;

public class BooksRunner {
    public static void main(String[] args) {
        Books books = new Books();
        books.pages();
        books.type();
        books.size();
        books.print();
        books.read();
        System.out.println("------------------------");

        Books books1 = new Books();
        books1.pages();
        books1.type();
        books1.size();
        books1.print();
        books1.read();
        System.out.println("------------------------");

        Books books2 = new Books();
        books2.pages();
        books2.type();
        books2.size();
        books2.print();
        books2.read();
        System.out.println("------------------------");

        Books books3 = new Books();
        books3.pages();
        books3.type();
        books3.size();
        books3.print();
        books3.read();
        System.out.println("------------------------");

        Classmate classmate=new Classmate();
        classmate.pages();
        classmate.type();
        classmate.size();
        classmate.print();
        classmate.read();
        System.out.println("------------------------");

        BooksCast booksCast=new BooksCast();
        booksCast.size(books);
        booksCast.size(classmate);

    }
}
