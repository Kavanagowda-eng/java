package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Textbook;
import com.xworkz.Inheritence.internal.Notepad;

public class WritingPadRunner {
    public static void main(String[]args){
        Textbook.WritingPad writingPad=new Textbook.WritingPad();
        writingPad.type();
        writingPad.design();
        writingPad.use();
        writingPad.color();
        writingPad.clean();

        System.out.println("--------------------------------");

        Textbook.WritingPad writingPad1=new Notepad();
        writingPad1.type();
        writingPad1.design();
        writingPad1.use();
        writingPad1.color();
        writingPad1.clean();

        System.out.println("--------------------------------");
    }
}
