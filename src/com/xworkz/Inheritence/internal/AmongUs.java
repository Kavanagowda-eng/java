package com.xworkz.Inheritence.internal;

import com.xworkz.Inheritence.External.Games;

    public class AmongUs extends Games {
        public AmongUs() {
            super();
            System.out.println("No args const in AmongUs");
        }

        @Override
        public void admin() {
            super.admin();
        }

        @Override
        public void expert() {
            super.expert();
        }

        @Override
        public void join() {
            super.join();
        }

        @Override
        public void noob() {
            super.noob();
        }

        @Override
        public void play() {
            super.play();
        }

        public void kill() {
            System.out.println("no of kills");
        }
    }

