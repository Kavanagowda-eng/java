package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.History;
import com.xworkz.Inheritence.internal.Story;

public class HistoryRunner {
    public static void main(String[]args){
        History history=new History();
        history.book();
        history.people();
        history.statue();
        history.type();
        history.rating();

        System.out.println("--------------------------------");

        History history1=new Story();
        history1.book();
        history1.people();
        history1.statue();
        history1.type();
        history1.rating();

        System.out.println("--------------------------------");
        Story story=new Story();
        story.book();
        story.people();
        story.statue();
        story.type();
        story.rating();

        System.out.println("--------------------------------");
    }
}
