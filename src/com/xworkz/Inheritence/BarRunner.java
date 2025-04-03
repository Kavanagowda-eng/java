package com.xworkz.Inheritence;

public class BarRunner {

        public static void main(String[] args) {
            SportsBar sportsBar = new SportsBar(); // Creating SportsBar object

            // Calling inherited methods from Bar
            sportsBar.serveDrinks();
            sportsBar.playMusic();
            sportsBar.offerSeating();
            sportsBar.maintainHygiene();
            sportsBar.operateLateNight();
        }
    }

