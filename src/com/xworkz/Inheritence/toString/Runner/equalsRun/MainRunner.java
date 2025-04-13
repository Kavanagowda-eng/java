package com.xworkz.Inheritence.toString.Runner.equalsRun;
import com.xworkz.Inheritence.ToString1.*;
public class MainRunner {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------");
        AirConditioner airConditioner1 = new AirConditioner("Lenovo", 6, true);
        AirConditioner airConditioner2 = new AirConditioner("Lenevo", 6, true);
        System.out.println("Both are same: " + airConditioner1.equals(airConditioner2));

        System.out.println("---------------------------------------------");
        Apartment apartment1 = new Apartment("marbal", 2000, true);
        Apartment apartment2 = new Apartment("marbel", 2000, true);
        System.out.println("Both are same: " + apartment1.equals(apartment2));

        System.out.println("---------------------------------------------");
        Bar bar1 = new Bar("Bachardi", 34, true);
        Bar bar2 = new Bar("bachardi", 123, true);
        System.out.println("Both are same: " + bar1.equals(bar2));

        System.out.println("---------------------------------------------");
        Bathroom bathroom1 = new Bathroom("yes", 123, true);
        Bathroom bathroom2 = new Bathroom("yes", 123, true);
        System.out.println("Both are same: " + bathroom1.equals(bathroom2));

        System.out.println("---------------------------------------------");
        Beach beach1 = new Beach("soil", 123, true);
        Beach beach2= new Beach("Sand", 123, true);
        System.out.println("Both are same: " + beach1.equals(beach2));

        System.out.println("---------------------------------------------");
        Bicycle bicycle1 = new Bicycle("hero", 123, true);
        Bicycle bicycle2 = new Bicycle("hero", 123, true);
        System.out.println("Both are same: " + bicycle1.equals(bicycle2));

        System.out.println("---------------------------------------------");
        Book book1 = new Book("MRF",44,true);
        Book book2 = new Book("CEAT",54,true);
        System.out.println("Both are same: " + book1.equals(book2));

        System.out.println("---------------------------------------------");
        Bottle bottle1 = new Bottle("plastic",1,true);
        Bottle bottle2 = new Bottle("plastic",2,true);
        System.out.println("Both are same: " + bottle1.equals(bottle2));

        System.out.println("---------------------------------------------");
        Bridge obj1 = new Bridge("m", 123,true);
        Bridge obj2 = new Bridge("s", 123,true);
        System.out.println("Both are same: " + obj1.equals(obj2));

        System.out.println("---------------------------------------------");
        Building building1 = new Building("four", 123, true);
        Building building2 = new Building("four", 123, true);
        System.out.println("Both are same: " + building1.equals(building2));

        System.out.println("---------------------------------------------");
        Bus bus1 = new Bus("government", 123,true);
        Bus bus2 = new Bus("private", 123,true);
        System.out.println("Both are same: " + bus1.equals(bus2));

        System.out.println("---------------------------------------------");
        Cafe cafe1 = new Cafe("Sample", 123, true);
        Cafe cafe2 = new Cafe("Sample", 123, true);
        System.out.println("Both are same: " + cafe1.equals(cafe2));

        System.out.println("---------------------------------------------");
        Camera camera1 = new Camera("Sample",44,true);
        Camera camera2 = new Camera("Sample", 44,true);
        System.out.println("Both are same: " + camera1.equals(camera2));

        System.out.println("---------------------------------------------");
        Desert desert1 = new Desert("Sample", 123, true);
        Desert desert2 = new Desert("Sample", 123, true);
        System.out.println("Both are same: " + desert1.equals(desert2));

        System.out.println("---------------------------------------------");
        Fence fence1 = new Fence("Sample", 123,true);
        Fence fence2 = new Fence("Sample", 123,true);
        System.out.println("Both are same: " +fence1.equals(fence2));

        System.out.println("---------------------------------------------");
        Fan fan1 = new Fan("Sample",22,true);
        Fan fan2 = new Fan("Sample",44,true);
        System.out.println("Both are same: " + fan1.equals(fan2));

        System.out.println("---------------------------------------------");
        Drone drone1 = new Drone("Sample",55,true);
        Drone drone2 = new Drone("Sample",45,true);
        System.out.println("Both are same: " + drone1.equals(drone2));

        System.out.println("---------------------------------------------");
        Door door1 = new Door("Sample", 123,true);
        Door door2 = new Door("Sample", 123,true);
        System.out.println("Both are same: " + door1.equals(door2));

        System.out.println("---------------------------------------------");
        Fridge fridge1 = new Fridge("Sample",57,true);
        Fridge fridge2 = new Fridge("Sample",67,true);
        System.out.println("Both are same: " + fridge1.equals(fridge2));

        System.out.println("---------------------------------------------");
        Forest  forest1 = new Forest("Sample", 123, true);
        Forest forest2= new Forest("Sample", 123, true);
        System.out.println("Both are same: " + forest1.equals(forest2));

        System.out.println("---------------------------------------------");
        Glove glove1 = new Glove("Sample", 123,true);
        Glove glove2 = new Glove("Sample", 123,true);
        System.out.println("Both are same: " + glove1.equals(glove2));

        System.out.println("---------------------------------------------");
        Garden garden1 = new Garden("Sample", 123, true);
        Garden garden2 = new Garden("Sample", 123, true);
        System.out.println("Both are same: " + garden1.equals(garden2));

        System.out.println("---------------------------------------------");
        Gym gym1 = new Gym("Sample", 123, true);
        Gym gym2 = new Gym("Sample", 123, true);
        System.out.println("Both are same: " + gym1.equals(gym2));

        System.out.println("---------------------------------------------");
        Headphone headphone1 = new Headphone("Sample",55,true);
        Headphone headphone2 = new Headphone("Sample",67,true);
        System.out.println("Both are same: " + headphone1.equals(headphone2));

        System.out.println("---------------------------------------------");
        Helmet helmet1 = new Helmet("Sample", 123,true);
        Helmet helmet2 = new Helmet("Sample", 123,true);
        System.out.println("Both are same: " + helmet1.equals(helmet2));

        System.out.println("---------------------------------------------");
        Hospital hospital1 = new Hospital("Sample", 123, true);
        Hospital hospital2= new Hospital("Sample", 123, true);
        System.out.println("Both are same: " + hospital1.equals(hospital2));

        System.out.println("---------------------------------------------");
        House house1= new House("Sample", 123, true);
        House house2 = new House("Sample", 123, true);
        System.out.println("Both are same: " + house1.equals(house2));

        System.out.println("---------------------------------------------");
        Island island1= new Island("Sample", 123, true);
        Island island2= new Island("Sample", 123, true);
        System.out.println("Both are same: " + island1.equals(island2));

        System.out.println("---------------------------------------------");
        Jacket jacket1 = new Jacket("Sample", 123,true);
        Jacket jacket2= new Jacket("Sample", 123,true);
        System.out.println("Both are same: " + jacket1.equals(jacket2));

        System.out.println("---------------------------------------------");
        Keyboard keyboard1 = new Keyboard("Sample",44,true);
        Keyboard keyboard2= new Keyboard("Sample",45,true);
        System.out.println("Both are same: " + keyboard1.equals(keyboard2));

        System.out.println("---------------------------------------------");
        Keychain keychain1 = new Keychain("Sample", 123,true);
        Keychain keychain2= new Keychain("Sample", 123,true);
        System.out.println("Both are same: " + keychain1.equals(keychain2));

        System.out.println("---------------------------------------------");
        Lab lab1 = new Lab("Sample", 123, true);
        Lab lab2= new Lab("Sample", 123, true);
        System.out.println("Both are same: " + lab1.equals(lab2));


        Lake lake1 = new Lake("Sample", 123, true);
        Lake lake2= new Lake("Sample", 123, true);
        System.out.println("Both are same: " + lake1.equals(lake2));

        System.out.println("---------------------------------------------");
        Lamp lamp1 = new Lamp("Sample", 123,true);
        Lamp lamp2 = new Lamp("Sample", 123,true);
        System.out.println("Both are same: " + lamp1.equals(lamp2));

        System.out.println("---------------------------------------------");
        Library library1 = new Library("Sample", 123, true);
        Library library2= new Library("Sample", 123, true);
        System.out.println("Both are same: " + library1.equals(library2));

        System.out.println("---------------------------------------------");
        Mall mall1 = new Mall("Sample", 123, true);
        Mall mall2 = new Mall("Sample", 123, true);
        System.out.println("Both are same: " + mall1.equals(mall2));

        System.out.println("---------------------------------------------");
        Mirror mirror1 = new Mirror("Sample", 123,true);
        Mirror mirror2= new Mirror("Sample", 123,true);
        System.out.println("Both are same: " + mirror1.equals(mirror2));

        System.out.println("---------------------------------------------");
        Mobile mobile1 = new Mobile("Sample",23,true);
        Mobile mobile2= new Mobile("Sample",55,true);
        System.out.println("Both are same: " + mobile1.equals(mobile2));

        System.out.println("---------------------------------------------");
        Motorcycle motorcycle1= new Motorcycle("Sample", 123,true);
        Motorcycle motorcycle2= new Motorcycle("Sample", 123,true);
        System.out.println("Both are same: " + motorcycle1.equals(motorcycle2));

        System.out.println("---------------------------------------------");
        Mountain mountain1 = new Mountain("Sample", 123, true);
        Mountain mountain2 = new Mountain("Sample", 123, true);
        System.out.println("Both are same: " + mountain1.equals(mountain2));

        System.out.println("---------------------------------------------");
        Mouse mouse1 = new Mouse("Sample",45,true);
        Mouse mouse2= new Mouse("Sample",34,true);
        System.out.println("Both are same: " + mouse1.equals(mouse2));

        System.out.println("---------------------------------------------");
        Museum museum1 = new Museum("Sample", 123, true);
        Museum museum2= new Museum("Sample", 123, true);
        System.out.println("Both are same: " + museum1.equals(museum2));

        System.out.println("---------------------------------------------");
        Notebook notebook1 = new Notebook("Sample",45,true);
        Notebook notebook2 = new Notebook("Sample",54,true);
        System.out.println("Both are same: " + notebook1.equals(notebook2));

        System.out.println("---------------------------------------------");
        Pants pants1= new Pants("Sample", 123,true);
        Pants pants2 = new Pants("Sample", 123,true);
        System.out.println("Both are same: " +pants1 .equals(pants2));

        System.out.println("---------------------------------------------");
        Park park1 = new Park("Sample", 123, true);
        Park park2 = new Park("Sample", 123, true);
        System.out.println("Both are same: " + park1.equals(park2));

        System.out.println("---------------------------------------------");
        Pencil pencil1 = new Pencil("Sample",55,true);
        Pencil pencil2= new Pencil("Sample",66,true);
        System.out.println("Both are same: " + pencil1.equals(pencil2));

        System.out.println("---------------------------------------------");
        Pen pen1= new Pen("Sample",45,true);
        Pen pen2= new Pen("Sample",66,true);
        System.out.println("Both are same: " + pen1.equals(pen2));

        System.out.println("---------------------------------------------");
        Pharmacy pharmacy1 = new Pharmacy("Sample", 123, true);
        Pharmacy pharmacy2= new Pharmacy("Sample", 123, true);
        System.out.println("Both are same: " + pharmacy1.equals(pharmacy2));

        System.out.println("---------------------------------------------");
        Phone phone1= new Phone("Sample",56,true);
        Phone phone2 = new Phone("Sample",66,true);
        System.out.println("Both are same: " + phone1.equals(phone2));

        System.out.println("---------------------------------------------");
        Plane plane1 = new Plane("Sample", 123,true);
        Plane plane2= new Plane("Sample", 123,true);
        System.out.println("Both are same: " + plane1.equals(plane2));

        System.out.println("---------------------------------------------");
        Printer printer1 = new Printer("Sample",44,true);
        Printer printer2= new Printer("Sample",66,true);
        System.out.println("Both are same: " + printer1.equals(printer2));

        System.out.println("---------------------------------------------");
        Restaurant restaurant1= new Restaurant("Sample", 123, true);
        Restaurant restaurant2 = new Restaurant("Sample", 123, true);
        System.out.println("Both are same: " + restaurant1.equals(restaurant2));

        System.out.println("---------------------------------------------");
        River river1 = new River("Sample", 123, true);
        River river2= new River("Sample", 123, true);
        System.out.println("Both are same: " + river1.equals(river2));

        Road road1= new Road("Sample", 123,true);
        Road road2= new Road("Sample", 123,true);
        System.out.println("Both are same: " + road1.equals(road2));

        System.out.println("---------------------------------------------");
        Robot robot1= new Robot("Sample",55,true);
        Robot robot2 = new Robot("Sample",66,true);
        System.out.println("Both are same: " + robot1.equals(robot2));

        System.out.println("---------------------------------------------");
        Scanner scanner1 = new Scanner("Sample",55,true);
        Scanner scanner2 = new Scanner("Sample",55,true);
        System.out.println("Both are same: " + scanner1.equals(scanner2));

        System.out.println("---------------------------------------------");
        School school1 = new School("Sample", 123, true);
        School school2 = new School("Sample", 123, true);
        System.out.println("Both are same: " + school1.equals(school2));

        System.out.println("---------------------------------------------");
        Scooter scooter1 = new Scooter("Sample", 123,true);
        Scooter scooter2= new Scooter("Sample", 123,true);
        System.out.println("Both are same: " + scooter1.equals(scooter2));

        System.out.println("---------------------------------------------");
        Ship ship1 = new Ship("Sample", 123,true);
        Ship ship2 = new Ship("Sample", 123,true);
        System.out.println("Both are same: " + ship1.equals(ship2));

        System.out.println("---------------------------------------------");
        Shoe shoe1 = new Shoe("Sample",3,true);
        Shoe shoe2= new Shoe("Sample",55,true);
        System.out.println("Both are same: " + shoe1.equals(shoe2));

        System.out.println("---------------------------------------------");
        Socks socks1 = new Socks("Sample", 123,true);
        Socks socks2= new Socks("Sample", 123,true);
        System.out.println("Both are same: " + socks1.equals(socks2));

        System.out.println("---------------------------------------------");
        Student student1 = new Student("Sample",33,true);
        Student student2 = new Student("Sample",55,true);
        System.out.println("Both are same: " + student1.equals(student2));
    }
}



