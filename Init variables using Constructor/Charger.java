public class Charger {
	String brand;
	int power;
	boolean wireless;
	
	public Charger(String brand,int power,boolean wireless){
		this.brand=brand;
		this.power=power;
		this.wireless=wireless;
	}
		
	public static void main (String[]args){
			Charger charger1 = new Charger("Redmi",20,false);
			Charger charger2 = new Charger("Vivo",18,false);
			Charger charger3 = new Charger("iPhone",30,true);
			Charger charger4 = new Charger("samsung",20,false);
			Charger charger5 = new Charger("Redmi",20,false);
			
			System.out.println("Charger1:" + charger1.brand+","+charger1.power+","+charger1.wireless);
			System.out.println("Charger2:" + charger2.brand+","+charger2.power+","+charger2.wireless);
			System.out.println("Charger3:" + charger3.brand+","+charger3.power+","+charger3.wireless);
			System.out.println("Charger4:" + charger4.brand+","+charger4.power+","+charger4.wireless);
			System.out.println("Charger5:" + charger5.brand+","+charger5.power+","+charger5.wireless);
			
		} 
	}
