class Color {
    String shade;
    String type;
    double quantity;
    int cost;
    String brand;
    
    
    Color() {
        System.out.println("color");
    }

  
    Color(String shade, String type) {
        this.shade = shade;
        this.type = type;
        System.out.println("color1: " + shade + ", " + type);
    }

    
    Color(double quantity, int cost) {
        this();  
        this.quantity = quantity;
        this.cost = cost;
        System.out.println("color2: " + quantity + ", " + cost);
    }

  
    Color(String brand, String shade) {
        this(); 
        this.brand = brand;
        this.shade = shade;
        System.out.println("color3: " + brand + ", " + shade);
    }


    Color(String shade, String type, double quantity, int cost) {
        this(shade, type); 
        this.quantity = quantity;
        this.cost = cost;
        System.out.println("color4: " + shade + ", " + type + ", " + quantity + ", " + cost);
    }

   
    Color(String shade, String type, double quantity, int cost, String brand) {
        this(shade, type);  
        this.quantity = quantity;
        this.cost = cost;
        this.brand = brand;
        System.out.println("color5: " + shade + ", " + type + ", " + quantity + ", " + cost + ", " + brand);
    }
}

