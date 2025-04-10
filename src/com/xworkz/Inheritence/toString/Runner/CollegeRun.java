package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.College;

public class CollegeRun {
    public static void main(String[]args){
        College college = new College("Science, Arts", 2000, true);
        System.out.println(college);
        System.out.println(college.hashCode());
        System.out.println("Original:"+System.identityHashCode(college));
        System.out.println("-------------------------");}
}
