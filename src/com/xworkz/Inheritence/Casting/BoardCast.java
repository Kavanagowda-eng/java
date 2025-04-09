package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Board;
import com.xworkz.Inheritence.internal.Duster;

public class BoardCast {
    public void Clean(Board board) {
        board.chalk();
        board.color();
        board.write();
        board.read();
        board.clean();

        if (board instanceof Duster) {
            Duster duster = new Duster();
            duster.type();
        }
    }
}
