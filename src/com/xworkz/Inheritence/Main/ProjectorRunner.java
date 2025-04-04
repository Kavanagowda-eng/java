package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.Projector;
import com.xworkz.Inheritence.internal.DLP;

public class ProjectorRunner {
    public static void main(String[] args) {

    Projector projector = new Projector();
        projector.type();
        projector.design();
        projector.use();
        projector.color();
        projector.clean();

        System.out.println("--------------------------------");

    Projector projector1 = new DLP();
        projector1.type();
        projector1.design();
        projector1.use();
        projector1.color();
        projector1.clean();

        System.out.println("--------------------------------");

    DLP dlp = new DLP();
        dlp.type();
        dlp.design();
        dlp.use();
        dlp.color();
        dlp.clean();

        System.out.println("--------------------------------");
}
}
