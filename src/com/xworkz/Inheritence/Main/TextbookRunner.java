package com.xworkz.Inheritence.Main;
import com.xworkz.Inheritence.External.Textbook;
public class TextbookRunner {
    public static void main(String[]args) {
        Textbook textbook = new Textbook();
        textbook.type();
        textbook.design();
        textbook.read();
        textbook.color();
        textbook.write();

        Textbook textbook1 = new Textbook();
        textbook1.type();
        textbook1.design();
        textbook1.read();
        textbook1.color();
        textbook1.write();

    }

}
