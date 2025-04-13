package com.xworkz.Inheritence.ToString1;

public class Hospital {
    private String beds;
    private int departments;
    private boolean isPrivate;

    public Hospital(String beds, int departments, boolean isPrivate) {
        this.beds = beds;
        this.departments = departments;
        this.isPrivate = isPrivate;
    }

    @Override
    public String toString() {
        return "Hospital: beds=" + beds + ", departments=" + departments + ", isPrivate=" + isPrivate;
    }
    @Override
    public int hashCode() {
        return 93;}

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            System.out.println("not null");
        }
        if(obj instanceof Hospital){
            Hospital hospital1=this;
           Hospital hospital2=(Hospital) obj;
            if(hospital1.beds== hospital2.beds){
                return true;
            }
        }
        return false;
    }
}
