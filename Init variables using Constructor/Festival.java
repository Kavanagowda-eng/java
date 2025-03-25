public class Festival {

    String name;
    String date;
    String location;

    public Festival(String name, String date, String location) {
        this.name = name;
        this.date = date;
        this.location = location;
    }

    public static void main(String[] args) {
    
        Festival festival1 = new Festival("Diwali", "November 2025", "India");
        Festival festival2 = new Festival("Holi", "March 2025", "India");
        Festival festival3 = new Festival("Eid", "May 2025", "India");
        Festival festival4 = new Festival("Christmas", "December 2025", "everyware");
        Festival festival5 = new Festival("New Year", "January 2025", "everyware");

        System.out.println("Festival 1: " + festival1.name + ", " + festival1.date + ", " + festival1.location);
        System.out.println("Festival 2: " + festival2.name + ", " + festival2.date + ", " + festival2.location);
        System.out.println("Festival 3: " + festival3.name + ", " + festival3.date + ", " + festival3.location);
        System.out.println("Festival 4: " + festival4.name + ", " + festival4.date + ", " + festival4.location);
        System.out.println("Festival 5: " + festival5.name + ", " + festival5.date + ", " + festival5.location);
    }
}
