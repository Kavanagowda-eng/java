package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Home;
import com.xworkz.Inheritence.internal.Apartment;

public class HomeCast {
        public void Clean(Home home) {
           home.secureDoors();
           home.hasGarden();
           home.hasKitchen();
           home.hasRooms();
           home.provideShelter();

            if (home instanceof Apartment) {
                Apartment apartment=new Apartment();
                apartment.color();
            }
        }
    }
    
