package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Pant;
import com.xworkz.Inheritence.internal.Jeans;

public class PantRunner {
        public static void main(String[] args) {
            Pant pant = new Pant();
            pant.wearPant();
            pant.foldPant();
            pant.washPant();
            pant.checkSize();
            pant.checkMaterial();

            Pant pant1 = new Jeans();
            pant1.wearPant();
            pant1.foldPant();
            pant1.washPant();
            pant1.checkSize();
            pant1.checkMaterial();

            Pant pant2 = new Jeans();
            pant2.wearPant();
            pant2.foldPant();
            pant2.washPant();
            pant2.checkSize();
            pant2.checkMaterial();

            Pant pant3 = new Jeans();
            pant3.wearPant();
            pant3.foldPant();
            pant3.washPant();
            pant3.checkSize();
            pant3.checkMaterial();
        }
    }

