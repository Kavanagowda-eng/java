package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.internal.ChocolateCream;
import com.xworkz.Inheritence.External.Cream;

public class CreamRunner {

        public static void main(String[] args) {

            Cream cream = new Cream();
            cream.applyCream();
            cream.provideMoisture();
            cream.scent();
            cream.soothingEffect();
            cream.packaging();

            Cream cream1 = new ChocolateCream();
            cream1.applyCream();
            cream1.provideMoisture();
            cream1.scent();
            cream1.soothingEffect();
            cream1.packaging();

            Cream cream2 = new ChocolateCream();
            cream2.applyCream();
            cream2.provideMoisture();
            cream2.scent();
            cream2.soothingEffect();
            cream2.packaging();

            Cream cream3 = new ChocolateCream();
            cream3.applyCream();
            cream3.provideMoisture();
            cream3.scent();
            cream3.soothingEffect();
            cream3.packaging();


        }
        }
