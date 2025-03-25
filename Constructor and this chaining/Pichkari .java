class Pichkari {
    String shape;
    String color;
    double capacity;
    int cost;
    int noPichkari;
    char size;

  
    Pichkari() {
        System.out.println("pichkari");
    }

  
    Pichkari(String shape, String color) {
        this.shape = shape;
        this.color = color;
        System.out.println("pichkari1: " + shape + ", " + color);
    }

 
    Pichkari(double capacity, int cost) {
        this(); 
        this.capacity = capacity;
        this.cost = cost;
        System.out.println("pichkari2: " + capacity + ", " + cost);
    }

  
    Pichkari(int noPichkari, char size) {
        this();  
        this.noPichkari = noPichkari;
        this.size = size;
        System.out.println("pichkari3: " + noPichkari + ", " + size);
    }

   
    Pichkari(String shape, String color, double capacity, int cost) {
        this(shape, color); 
        this.capacity = capacity;
        this.cost = cost;
        System.out.println("pichkari4: " + shape + ", " + color + ", " + capacity + ", " + cost);
    }


    Pichkari(String shape, String color, double capacity, int cost, int noPichkari, char size) {
       
        this.shape = shape;
        this.color = color;
        this.capacity = capacity;
        this.cost = cost;
        this.noPichkari = noPichkari;
        this.size = size;
        System.out.println("pichkari5: " + shape + ", " + color + ", " + capacity + ", " + cost + ", " + noPichkari + ", " + size);
    }
}


