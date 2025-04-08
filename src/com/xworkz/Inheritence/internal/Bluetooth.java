package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Earphone;

    public class Bluetooth extends Earphone {
        public Bluetooth(){
            super();
            System.out.println("No args const in Bluetooth");
        }

        @Override
        public void device() {
            super.device();
        }

        @Override
        public void mobile() {
            super.mobile();
        }

        @Override
        public void purchase() {
            super.purchase();
        }

        @Override
        public void share() {
            super.share();
        }

        @Override
        public void connect() {
            super.connect();
        }
        public void color() {
            System.out.println("color of the fruit");
        }
    }




