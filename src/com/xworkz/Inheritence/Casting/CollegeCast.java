package com.xworkz.Inheritence.Casting;

import com.xworkz.Inheritence.internal.Campus;
import com.xworkz.Inheritence.internal.College;

public class CollegeCast {
    public void activity(College college) {
        college.activity();
        college.certificates();
        college.events();
        college.exams();
        college.teach();

        if (college instanceof Campus) {
            Campus campus = new Campus();
            campus.color();
        }
    }
    }
