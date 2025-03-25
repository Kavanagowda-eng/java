public class Ladder {

    public void extend(double length) {
        System.out.println("Extending ladder by " + length + " meters.");
    }
	
    public void retract(double length) {
        System.out.println("Retracting ladder by " + length + " meters.");
    }

    public void paint(String color) {
        System.out.println("Painting ladder " + color + ".");
    }

    public void adjustHeight(double currentHeight, double desiredHeight) {
        System.out.println("Adjusting ladder from " + currentHeight + " meters to " + desiredHeight + " meters.");
    }

    public void supportWeight(double weight, int duration) {
        System.out.println("Supporting " + weight + " kg for " + duration + " hours.");
    }

    public void move(String location, double distance, String direction) {
        System.out.println("Moving ladder to " + location + ", " + distance + " meters " + direction + ".");
    }

    public void inspect(String date, String inspector, String remarks) {
        System.out.println("Inspection on " + date + " by " + inspector + ": " + remarks + ".");
    }
}