package com.xworkz.Inheritence.toString.Runner;

import com.xworkz.Inheritence.ToString1.Teacher;

public class TeacherRun {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sample", 456, true);
        System.out.println(teacher);
        System.out.println(teacher.hashCode());
        System.out.println("Original:"+System.identityHashCode(teacher));
        System.out.println("-------------------------");
    }
}
