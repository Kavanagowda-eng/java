package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Art;
import com.xworkz.Inheritence.internal.Artist;

public class ArtRunner {
    public static void main(String[] args) {
        Art art=new Art();
        art.buy();
        art.sell();
        art.create();
        art.frame();
        art.draw();

        System.out.println("------------------------");

        Art art1=new Artist();
        art1.buy();
        art1.sell();
        art1.create();
        art1.frame();
        art1.draw();

        System.out.println("-------------------------");

        Artist artist=new Artist();
        artist.buy();
        artist.sell();
        artist.create();
        artist.frame();
        artist.draw();

        System.out.println("-------------------------");
    }
}
