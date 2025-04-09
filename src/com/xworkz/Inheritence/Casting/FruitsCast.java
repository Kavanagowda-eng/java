package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Fruits;
import com.xworkz.Inheritence.internal.Banana;

public class FruitsCast {
    public void eat(Fruits fruits) {
           fruits.eat();
           fruits.buy();
           fruits.cut();
           fruits.sell();
           fruits.distribute();

            if (fruits instanceof Banana) {
                Banana banana =new Banana();
                banana.color();
            }
        }
    }


