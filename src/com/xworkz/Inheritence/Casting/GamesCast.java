package com.xworkz.Inheritence.Casting;
import com.xworkz.Inheritence.External.Games;
import com.xworkz.Inheritence.internal.AmongUs;


public class GamesCast {
        public void admin(Games games) {
            games.admin();
            games.expert();
            games.join();
            games.noob();
            games.play();

            if (games instanceof AmongUs) {
                AmongUs amongUs=new AmongUs();
                amongUs.kill();
            }
        }
    }

