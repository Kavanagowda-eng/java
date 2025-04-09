package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Textbook;

public class Author extends Textbook {
    public Author() {
        super();
        System.out.println("No args const in Author");
    }

    @Override
    public void design() {
        super.design();
    }

    @Override
    public void read() {
        super.read();
    }

    @Override
    public void write() {
        super.write();
    }


    public void name() {
        System.out.println("name of the author");
    }
}


