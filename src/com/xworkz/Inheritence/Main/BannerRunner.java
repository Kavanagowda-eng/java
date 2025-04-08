package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Banner;
import com.xworkz.Inheritence.External.Mesh;

public class BannerRunner {
    public static void main(String[]args){
        Banner banner=new Banner();
        banner.type();
        banner.design();
        banner.display();
        banner.color();
        banner.put();

        System.out.println("--------------------------------");

        Banner banner1=new Mesh();
        banner1.type();
        banner1.design();
        banner1.display();
        banner1.color();
        banner1.put();

        System.out.println("--------------------------------");

        Banner banner2=new Mesh();
        banner2.type();
        banner2.design();
        banner2.display();
        banner2.color();
        banner2.put();

        System.out.println("--------------------------------");

        Banner banner3=new Mesh();
        banner3.type();
        banner3.design();
        banner3.display();
        banner3.color();
        banner3.put();

        System.out.println("--------------------------------");
    }
    }

