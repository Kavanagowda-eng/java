class Holi {
    String shape;
    String color;
    double capacity;
    int cost;
    int noHoli;
    char size;


    Holi() {
        System.out.println("holi");
    }

   
    Holi(String shape, String color) {
        this.shape = shape;
        this.color = color;
        System.out.println("holi1: " + shape + ", " + color);
    }

   
    Holi(double capacity, int cost) {
        this(); 
        this.capacity = capacity;
        this.cost = cost;
        System.out.println("holi2: " + capacity + ", " + cost);
    }

    Holi(int noHoli, char size) {
        this(); 
        this.noHoli = noHoli;
        this.size = size;
        System.out.println("holi3: " + noHoli + ", " + size);
    }

    Holi(String shape, String color, double capacity, int cost) {
        this(shape, color);  // Calls Constructor 1
        this.capacity = capacity;
        this.cost = cost;
        System.out.println("holi4: " + shape + ", " + color + ", " + capacity + ", " + cost);
    }

   Holi(String shape, String color, double capacity, int cost, int noHoli, char size) {
        
        this.shape = shape;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
        this.noHoli = noHoli;
        this.size = size;
        System.out.println("holi5: " + shape + ", " + color + ", " + capacity + ", " + cost + ", " + noHoli + ", " + size);
    }
}

