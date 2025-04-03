package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Festival;
import com.xworkz.Inheritence.internal.Diwali;

public class FestivalRunner {

        public static void main(String[] args) {
            Festival festival = new Festival();
            festival.celebrate();
            festival.lightDecorations();
            festival.distributeSweets();
            festival.performRituals();
            festival.enjoyFireworks();

            Festival festival1 = new Diwali();
            festival1.celebrate();
            festival1.lightDecorations();
            festival1.distributeSweets();
            festival1.performRituals();
            festival1.enjoyFireworks();

            Festival festival2 = new Festival();
            festival2.celebrate();
            festival2.lightDecorations();
            festival2.distributeSweets();
            festival2.performRituals();
            festival2.enjoyFireworks();

            Festival festival3 = new Festival();
            festival3.celebrate();
            festival3.lightDecorations();
            festival3.distributeSweets();
            festival3.performRituals();
            festival3.enjoyFireworks();
        }
    }

