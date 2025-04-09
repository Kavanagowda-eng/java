package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.Casting.BagCast;
import com.xworkz.Inheritence.External.Athlete;
import com.xworkz.Inheritence.External.Bag;
import com.xworkz.Inheritence.internal.SchoolBag;
import com.xworkz.Inheritence.internal.Sports;

public class BagRunner {

        public static void main(String[] args) {
            Bag bag = new Bag();
            bag.storeItems();
            bag.carryBag();
            bag.zipBag();
            bag.openBag();
            bag.checkCapacity();
            System.out.println("--------------------------------");

            Bag bag1 = new SchoolBag();
            bag1.storeItems();
            bag1.carryBag();
            bag1.zipBag();
            bag1.openBag();
            bag1.checkCapacity();
            System.out.println("--------------------------------");

            Bag bag2 = new SchoolBag();
            bag2.storeItems();
            bag2.carryBag();
            bag2.zipBag();
            bag2.openBag();
            bag2.checkCapacity();
            System.out.println("--------------------------------");

            Bag bag3 = new SchoolBag();
            bag3.storeItems();
            bag3.carryBag();
            bag3.zipBag();
            bag3.openBag();
            bag3.checkCapacity();
            System.out.println("--------------------------------");

            SchoolBag schoolBag=new SchoolBag();
            schoolBag.color();
            schoolBag.carryBag();
            schoolBag.zipBag();
            schoolBag.openBag();
            schoolBag.storeItems();

            BagCast bagCast=new BagCast();
            bagCast.BagItems(bag);
            bagCast.BagItems(schoolBag);
        }
    }

