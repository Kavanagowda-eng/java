class NailPolish {
    String shade;
    String brand;
    double quantity;
    int cost;

   
    NailPolish() {
        System.out.println("nailPolish");
    }

  
    NailPolish(String shade, String brand) {
        this.shade = shade;
        this.brand = brand;
        System.out.println("nailPolish1: " + shade + ", " + brand);
    }


    NailPolish(double quantity, int cost) {
        this(); 
        this.quantity = quantity;
        this.cost = cost;
        System.out.println("nailPolish2: " + quantity + ", " + cost);
    }

    
    NailPolish(String shade, String brand, double quantity, int cost) {
        this(shade, brand);  
        this.quantity = quantity;
        this.cost = cost;
        System.out.println("nailPolish3: " + shade + ", " + brand + ", " + quantity + ", " + cost);
    }
}

