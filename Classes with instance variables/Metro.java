public class Metro {
    String line;       
    String station;   
    double length;     
    double fare;       

    public static void main(String[] args) {
      
        Metro metro1 = new Metro();
        metro1.line = "Red Line";
        metro1.station = "Central Station";
        metro1.length = 25.5;
        metro1.fare = 2.50;

        Metro metro2 = new Metro();
        metro2.line = "Blue Line";
        metro2.station = "West Station";
        metro2.length = 20.0;
        metro2.fare = 3.00;

        Metro metro3 = new Metro();
        metro3.line = "Green Line";
        metro3.station = "North Station";
        metro3.length = 30.0;
        metro3.fare = 2.75;

        Metro metro4 = new Metro();
        metro4.line = "Yellow Line";
        metro4.station = "East Station";
        metro4.length = 15.5;
        metro4.fare = 2.25;

        Metro metro5 = new Metro();
        metro5.line = "Orange Line";
        metro5.station = "South Station";
        metro5.length = 22.3;
        metro5.fare = 3.25;

        Metro metro6 = new Metro();
        metro6.line = "Purple Line";
        metro6.station = "Downtown Station";
        metro6.length = 27.8;
        metro6.fare = 2.50;

        Metro metro7 = new Metro();
        metro7.line = "Pink Line";
        metro7.station = "Suburban Station";
        metro7.length = 18.4;
        metro7.fare = 2.75;

        Metro metro8 = new Metro();
        metro8.line = "Silver Line";
        metro8.station = "Airport Station";
        metro8.length = 10.0;
        metro8.fare = 4.00;

        Metro metro9 = new Metro();
        metro9.line = "Brown Line";
        metro9.station = "University Station";
        metro9.length = 28.7;
        metro9.fare = 3.50;

        Metro metro10 = new Metro();
        metro10.line = "Grey Line";
        metro10.station = "Park Station";
        metro10.length = 21.3;
        metro10.fare = 2.90;

       
        System.out.println("metro1 line: " + metro1.line);
        System.out.println("metro1 station: " + metro1.station);
        System.out.println("metro1 length: " + metro1.length + " km");
        System.out.println("metro1 fare: $" + metro1.fare);

        System.out.println("metro2 line: " + metro2.line);
        System.out.println("metro2 station: " + metro2.station);
        System.out.println("metro2 length: " + metro2.length + " km");
        System.out.println("metro2 fare: $" + metro2.fare);

        System.out.println("metro3 line: " + metro3.line);
        System.out.println("metro3 station: " + metro3.station);
        System.out.println("metro3 length: " + metro3.length + " km");
        System.out.println("metro3 fare: $" + metro3.fare);

        System.out.println("metro4 line: " + metro4.line);
        System.out.println("metro4 station: " + metro4.station);
        System.out.println("metro4 length: " + metro4.length + " km");
        System.out.println("metro4 fare: $" + metro4.fare);

        System.out.println("metro5 line: " + metro5.line);
        System.out.println("metro5 station: " + metro5.station);
        System.out.println("metro5 length: " + metro5.length + " km");
        System.out.println("metro5 fare: $" + metro5.fare);

        System.out.println("metro6 line: " + metro6.line);
        System.out.println("metro6 station: " + metro6.station);
        System.out.println("metro6 length: " + metro6.length + " km");
        System.out.println("metro6 fare: $" + metro6.fare);

        System.out.println("metro7 line: " + metro7.line);
        System.out.println("metro7 station: " + metro7.station);
        System.out.println("metro7 length: " + metro7.length + " km");
        System.out.println("metro7 fare: $" + metro7.fare);

        System.out.println("metro8 line: " + metro8.line);
        System.out.println("metro8 station: " + metro8.station);
        System.out.println("metro8 length: " + metro8.length + " km");
        System.out.println("metro8 fare: $" + metro8.fare);

        System.out.println("metro9 line: " + metro9.line);
        System.out.println("metro9 station: " + metro9.station);
        System.out.println("metro9 length: " + metro9.length + " km");
        System.out.println("metro9 fare: $" + metro9.fare);

        System.out.println("metro10 line: " + metro10.line);
        System.out.println("metro10 station: " + metro10.station);
        System.out.println("metro10 length: " + metro10.length + " km");
        System.out.println("metro10 fare: $" + metro10.fare);
    }
}
