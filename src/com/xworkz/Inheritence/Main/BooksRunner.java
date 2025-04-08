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

        Classmate classmate1=new Classmate();
        classmate1.pages();
        classmate1.type();
        classmate1.size();
        classmate1.print();
        classmate1.read();

        System.out.println("------------------------");

        Classmate classmate2=new Classmate();
        classmate2.pages();
        classmate2.type();
        classmate2.size();
        classmate2.print();
        classmate2.read();

        System.out.println("------------------------");

        Classmate classmate3=new Classmate();
        classmate3.pages();
        classmate3.type();
        classmate3.size();
        classmate3.print();
        classmate3.read();

        System.out.println("------------------------");


    }
}
