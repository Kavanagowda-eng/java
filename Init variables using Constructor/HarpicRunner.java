public class HarpicRunner{
public static void main (String[]args){
	Harpic harpic1 = new Harpic("harpic","red",1);
	Harpic harpic2 = new Harpic("harpic","blue",3);
	Harpic harpic3 = new Harpic("harpic","white",2);
	Harpic harpic4 = new Harpic("harpic","green",4);
	Harpic harpic5 = new Harpic("harpic","yellow",3);
	
	System.out.println("Harpic1:"+harpic1.brand+","+harpic1.color+","+harpic1.quantity);
	System.out.println("Harpic2:"+harpic2.brand+","+harpic2.color+","+harpic2.quantity);
	System.out.println("Harpic3:"+harpic3.brand+","+harpic3.color+","+harpic3.quantity);
	System.out.println("Harpic4:"+harpic4.brand+","+harpic4.color+","+harpic4.quantity);
	System.out.println("Harpic5:"+harpic5.brand+","+harpic5.color+","+harpic5.quantity);
	
	
}
}