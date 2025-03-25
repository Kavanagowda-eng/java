class Baloon
{
	String shape;
	String color;
	double capacity;
	int cost;
	int nobaloon;
	char size;
	
 Baloon()
 {
	System.out.println("baloon");
 }
 Baloon(String shape,String color)
 {
	this.shape=shape;
    this.color=color;	
	System.out.println("baloon1:"+ shape + "," + color);
 }
 
Baloon(double capacity,int cost)
{
	this();
	this.capacity=capacity;
	this.cost=cost;
	System.out.println("baloon2:"+ capacity + "," +cost);
}
Baloon(int nobaloon,char size)
{
	this();
	this.nobaloon=nobaloon;
	this.size=size;
	System.out.println("baloon3:"+ nobaloon + "," +size );

}

Baloon(String shape,String color,double capacity,int cost)
{
	this(shape, color); 
    this.capacity = capacity;
    this.cost = cost;
    System.out.println("Baloon4: " + shape + ", " + color + ", " + capacity + ", " + cost);
}

Baloon(String shape, String color, double capacity, int cost, int nobaloon, char size) {
   
    this.shape = shape;
    this.color = color;
    this.capacity = capacity;
    this.cost = cost;
    this.nobaloon = nobaloon;
    this.size = size;
    System.out.println("Baloon5: " + shape + ", " + color + ", " + capacity + ", " + cost + ", " + nobaloon + ", " + size);
}


}