package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Board;
import com.xworkz.Inheritence.internal.Duster;

public class BoardRunner {
    public static void main(String[]args) {
        Board board=new Board();
        board.clean();
        board.write();
        board.read();
        board.color();
        board.chalk();

        System.out.println("--------------------------------");

        Board board1=new Duster();
        board1.clean();
        board1.write();
        board1.read();
        board1.color();
        board1.chalk();

        System.out.println("--------------------------------");

        Duster duster1=new Duster();
        duster1.clean();
        duster1.write();
        duster1.read();
        duster1.color();
        duster1.chalk();

        System.out.println("--------------------------------");

        Duster duster2=new Duster();
        duster2.clean();
        duster2.write();
        duster2.read();
        duster2.color();
        duster2.chalk();

        System.out.println("--------------------------------");

        Duster duster3=new Duster();
        duster3.clean();
        duster3.write();
        duster3.read();
        duster3.color();
        duster3.chalk();

        System.out.println("--------------------------------");
    }
}
