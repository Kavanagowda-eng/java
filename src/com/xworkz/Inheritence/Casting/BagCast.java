package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.External.Bag;
import com.xworkz.Inheritence.internal.SchoolBag;

public class BagCast {
    public void BagItems(Bag bag) {
        bag.carryBag();
        bag.openBag();
        bag.zipBag();
        bag.storeItems();
        bag.checkCapacity();

        if (bag instanceof SchoolBag) {
            SchoolBag schoolBag = new SchoolBag();
            schoolBag.color();
        }
    }
}
