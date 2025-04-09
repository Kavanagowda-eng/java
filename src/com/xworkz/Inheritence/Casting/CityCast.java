package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.City;
import com.xworkz.Inheritence.internal.Bangalore;

public class CityCast {
        public void type(City city) {
            city.type();
            city.population();
            city.shop();
            city.travel();
            city.trees();

        if (city instanceof Bangalore) {
                Bangalore bangalore=new Bangalore();
                bangalore.street();
            }
        }
    }

