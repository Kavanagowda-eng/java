package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Art;
import com.xworkz.Inheritence.internal.Artist;

public class ArtCast {
    public void sell(Art art) {
        art.sell();
        art.buy();
        art.create();
        art.draw();
        art.frame();

        if (art instanceof Artist) {
            Artist artist = new Artist();
            artist.color();
        }
    }
}
