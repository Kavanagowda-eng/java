package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Oil;
import com.xworkz.Inheritence.internal.CoconutOil;

public class OilRunner {
        public static void main(String[] args) {
            Oil oil = new Oil();
            oil.pourOil();
            oil.checkViscosity();
            oil.storeOil();
            oil.useForCooking();
            oil.checkExpiry();

            Oil oil1 = new CoconutOil();
            oil1.pourOil();
            oil1.checkViscosity();
            oil1.storeOil();
            oil1.useForCooking();
            oil1.checkExpiry();

            Oil oil2 = new CoconutOil();
            oil2.pourOil();
            oil2.checkViscosity();
            oil2.storeOil();
            oil2.useForCooking();
            oil2.checkExpiry();

            Oil oil3 = new CoconutOil();
            oil3.pourOil();
            oil3.checkViscosity();
            oil3.storeOil();
            oil3.useForCooking();
            oil3.checkExpiry();
        }

}
