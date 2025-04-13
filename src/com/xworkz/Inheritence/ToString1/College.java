package com.xworkz.Inheritence.ToString1;

public class College {
    private String departments;
    private int students;
    private boolean hasHostel;

    public College(String departments, int students, boolean hasHostel) {
        this.departments = departments;
        this.students = students;
        this.hasHostel = hasHostel;
    }

    @Override
    public String toString() {
        return "College: departments=" + departments + ", students=" + students + ", hasHostel=" + hasHostel;
    }
    @Override
    public int hashCode() {
        return 45;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Cafe){
            College college1=this;
            College college2=(College) obj;
            if(college1.departments== college2.departments){
                return true;
            }
        }
        return false;
    }
}


