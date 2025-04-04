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
    }
}
