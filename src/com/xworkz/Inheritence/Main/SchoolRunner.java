package com.xworkz.Inheritence.Main;

import com.xworkz.Inheritence.External.School;
import com.xworkz.Inheritence.internal.HighSchool;

public class SchoolRunner {

        public static void main(String[] args) {
            School school = new School();
            school.conductClasses();
            school.conductExams();
            school.organizeEvents();
            school.provideLibraryAccess();
            school.manageDiscipline();

            School school1 = new HighSchool();
            school1.conductClasses();
            school1.conductExams();
            school1.organizeEvents();
            school1.provideLibraryAccess();
            school1.manageDiscipline();

            School school2 = new HighSchool();
            school2.conductClasses();
            school2.conductExams();
            school2.organizeEvents();
            school2.provideLibraryAccess();
            school2.manageDiscipline();

            School school3 = new HighSchool();
            school3.conductClasses();
            school3.conductExams();
            school3.organizeEvents();
            school3.provideLibraryAccess();
            school3.manageDiscipline();

        }
    }


