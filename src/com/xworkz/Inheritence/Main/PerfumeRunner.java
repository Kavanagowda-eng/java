package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Perfume;
import com.xworkz.Inheritence.internal.LuxuryPerfume;

public class PerfumeRunner {

        public static void main(String[] args) {
            Perfume perfume = new Perfume();
            perfume.sprayPerfume();
            perfume.checkFragrance();
            perfume.checkQuantity();
            perfume.storePerfume();
            perfume.checkExpiryDate();

            Perfume perfume1 = new LuxuryPerfume();
            perfume1.sprayPerfume();
            perfume1.checkFragrance();
            perfume1.checkQuantity();
            perfume1.storePerfume();
            perfume1.checkExpiryDate();

            Perfume perfume2 = new LuxuryPerfume();
            perfume2.sprayPerfume();
            perfume2.checkFragrance();
            perfume2.checkQuantity();
            perfume2.storePerfume();
            perfume2.checkExpiryDate();

            Perfume perfume3 = new LuxuryPerfume();
            perfume3.sprayPerfume();
            perfume3.checkFragrance();
            perfume3.checkQuantity();
            perfume3.storePerfume();
            perfume3.checkExpiryDate();
        }

    }

