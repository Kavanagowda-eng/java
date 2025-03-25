class Water {
    String type;
    double volume;
    int cost;
    String source;

    
    Water() {
        System.out.println("water");
    }

    
    Water(String type, double volume) {
        this.type = type;
        this.volume = volume;
        System.out.println("water1: " + type + ", " + volume);
    }

    
    Water(int cost, String source) {
        this(); 
        this.cost = cost;
        this.source = source;
        System.out.println("water2: " + cost + ", " + source);
    }

    
    Water(String type, double volume, int cost, String source) {
        this(type, volume); 
        this.cost = cost;
        this.source = source;
        System.out.println("water3: " + type + ", " + volume + ", " + cost + ", " + source);
    }
}

