public class LadderRunner {
    public static void main(String[] args) {
        System.out.println("Running Ladder in LadderRunner");
    Ladder ladder = new Ladder();
		double meter = 250.7;
        ladder.extend(meter);

        double cm = 700.6;
        ladder.retract(cm);

        String painted = "black";
        ladder.paint(painted); 

        double currentHeight = 100.12;
        double desiredHeight = 150.5;
        ladder.adjustHeight(currentHeight, desiredHeight);

        double kg = 400.8;
        int hours = 12;
        ladder.supportWeight(kg, hours);

        String location = "Hiriyur";
        double distance = 150.8;
        String direction = "left";
        ladder.move(location, distance, direction);

        String date = "12.11.2023";
        String inspector = "Sindhu";
        String remarks = "nothing";
        ladder.inspect(date, inspector, remarks);
    }
}
		
		
		

  
		
		