package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Games;
import com.xworkz.Inheritence.internal.AmongUs;

public class GamesRunner {
    public static void main(String[] args) {
        Games games = new Games();
        games.play();
        games.expert();
        games.admin();
        games.noob();
        games.join();

        System.out.println("------------------------");
        Games games4 = new AmongUs();
        games4.play();
        games4.expert();
        games4.admin();
        games4.noob();
        games4.join();

        System.out.println("------------------------");

        AmongUs amongUs = new AmongUs();
        amongUs.play();
        amongUs.expert();
        amongUs.admin();
        amongUs.noob();
        amongUs.join();
        System.out.println("------------------------");

    }
}