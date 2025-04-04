package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Moisturiser;
import com.xworkz.Inheritence.internal.Himalaya;

public class MoisturiserRunner {
    public static void main(String[] args) {
        Moisturiser moisturiser = new Moisturiser();
        moisturiser.cost();
        moisturiser.name();
        moisturiser.nourish();
        moisturiser.piece();
        moisturiser.quantity();

        Moisturiser moisturiser1 = new Himalaya();
        moisturiser1.quantity();
        moisturiser1.piece();
        moisturiser1.cost();
        moisturiser1.name();
        moisturiser1.nourish();

        Moisturiser moisturiser2 = new Himalaya();
        moisturiser2.quantity();
        moisturiser2.piece();
        moisturiser2.cost();
        moisturiser2.name();
        moisturiser2.nourish();

        Moisturiser moisturiser3 = new Himalaya();
        moisturiser3.quantity();
        moisturiser3.piece();
        moisturiser3.cost();
        moisturiser3.name();
        moisturiser3.nourish();
    }
    }

