class Egg {
    String type;       
    String color;      
    double weight;     
    int cost;          
    boolean isFresh;   
    int size;          

  
    Egg() {
        System.out.println("Egg created");
    }

   
    Egg(String type, String color) {
        this.type = type;
        this.color = color;
        System.out.println("Egg1: " + type + ", " + color);
    }

   
    Egg(double weight, int cost) {
        this();  
        this.weight = weight;
        this.cost = cost;
        System.out.println("Egg2: " + weight + " grams, " + cost + " currency");
    }

   
    Egg(boolean isFresh, int size) {
        this();  
        this.isFresh = isFresh;
        this.size = size;
        System.out.println("Egg3: " + isFresh + ", " + size);
    }

    Egg(String type, String color, double weight, int cost) {
        this(type, color);  
        this.weight = weight;
        this.cost = cost;
        System.out.println("Egg4: " + type + ", " + color + ", " + weight + " grams, " + cost + " currency");
    }

   
    Egg(String type, String color, double weight, int cost, boolean isFresh, int size) {
        
        this(type, color); 
        this.weight = weight;
        this.cost = cost;
        this.isFresh = isFresh;
        this.size = size;
        System.out.println("Egg5: " + type + ", " + color + ", " + weight + " grams, " + cost + " currency, " + isFresh + ", " + size);
    }
}

