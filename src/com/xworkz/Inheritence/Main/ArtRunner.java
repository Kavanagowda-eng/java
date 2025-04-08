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

        Artist artist2=new Artist();
        artist2.buy();
        artist2.sell();
        artist2.create();
        artist2.frame();
        artist2.draw();

        System.out.println("-------------------------");

        Artist artist3=new Artist();
        artist3.buy();
        artist3.sell();
        artist3.create();
        artist3.frame();
        artist3.draw();

        System.out.println("-------------------------");
    }
}
