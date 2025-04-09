package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Books;
import com.xworkz.Inheritence.internal.Camel;

public class BooksCast {
        public void size(Books books) {
           books.size();
           books.read();
           books.type();
           books.pages();
           books.print();

            if (books instanceof Camel) {
                Camel camel=new Camel();
                camel.clarity();
            }
        }
    }

