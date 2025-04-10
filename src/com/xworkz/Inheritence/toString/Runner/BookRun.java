package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Book;

public class BookRun {
    public static void main(String[]args){
        Book book = new Book("Penguin", 1, true);
        System.out.println(book);
        System.out.println(book.hashCode());
        System.out.println("Original:"+System.identityHashCode(book));
        System.out.println("-------------------------");
    }
}
