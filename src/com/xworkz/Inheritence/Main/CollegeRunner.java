package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.Casting.CollegeCast;
import com.xworkz.Inheritence.External.College;
import com.xworkz.Inheritence.internal.Campus;
public class CollegeRunner {
    public static void main(String[] args) {
        College college=new College();
        college.construction();
        college.library();
        college.lecturers();
        college.students();
        college.rating();

        System.out.println("--------------------------------");

        College college1=new College();
        college1.construction();
        college1.library();
        college1.lecturers();
        college1.students();
        college1.rating();

        System.out.println("--------------------------------");

        College college2=new College();
        college2.construction();
        college2.library();
        college2.lecturers();
        college2.students();
        college2.rating();

        System.out.println("--------------------------------");

        College college3=new College();
        college3.construction();
        college3.library();
        college3.lecturers();
        college3.students();
        college3.rating();
        System.out.println("--------------------------------");

        Campus campus=new Campus();
        college.construction();
        college.library();
        college3.lecturers();
        college3.students();
        college3.rating();
        System.out.println("--------------------------------");

        CollegeCast collegeCast=new CollegeCast();
        collegeCast.equals(college1);
        collegeCast.equals(campus);


    }
}
