package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.IceCream;
import com.xworkz.Inheritence.internal.Amul;

public class IceCreamCast {
        public void eatScope(IceCream iceCream) {
            iceCream.eatScoop();
            iceCream.flavor();
            iceCream.priceOf();
            iceCream.scoop();
            iceCream.select();
            if (iceCream instanceof Amul) {
                Amul amul = new Amul();
                amul.color();
            }
        }
        }