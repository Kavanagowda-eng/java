package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Sea;
import com.xworkz.Inheritence.internal.Arabian;

public class SeaCast {
    public void run(Sea sea) {
        sea.run();
        sea.type();
        sea.swim();
        sea.tree();
        sea.weather();

        if (sea instanceof Arabian) {
            Arabian arabian=new Arabian();
            arabian.color();
        }
    }
}
