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

        Duster duster=new Duster();
        duster.clean();
        duster.write();
        duster.read();
        duster.color();
        duster.chalk();

        System.out.println("--------------------------------");
    }
}
