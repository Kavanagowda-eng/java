package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Bag;
import com.xworkz.Inheritence.internal.SchoolBag;

public class BagRunner {

        public static void main(String[] args) {
            Bag bag = new Bag();
            bag.storeItems();
            bag.carryBag();
            bag.zipBag();
            bag.openBag();
            bag.checkCapacity();

            Bag bag1 = new SchoolBag();
            bag1.storeItems();
            bag1.carryBag();
            bag1.zipBag();
            bag1.openBag();
            bag1.checkCapacity();

            Bag bag2 = new SchoolBag();
            bag2.storeItems();
            bag2.carryBag();
            bag2.zipBag();
            bag2.openBag();
            bag2.checkCapacity();

            Bag bag3 = new SchoolBag();
            bag3.storeItems();
            bag3.carryBag();
            bag3.zipBag();
            bag3.openBag();
            bag3.checkCapacity();
        }
    }

