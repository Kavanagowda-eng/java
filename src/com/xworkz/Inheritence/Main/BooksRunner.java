package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Books;
import com.xworkz.Inheritence.internal.Classmate;

public class BooksRunner {
    public static void main(String[] args) {
        Books books1 = new Books();
        books1.pages();
        books1.type();
        books1.size();
        books1.print();
        books1.read();

        System.out.println("------------------------");
        Classmate classmate=new Classmate();
        classmate.pages();
        classmate.type();
        classmate.size();
        classmate.print();
        classmate.read();

        System.out.println("------------------------");


    }
}
