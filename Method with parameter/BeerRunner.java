public class BeerRunner {
    public static void main(String[] args) {
        System.out.println("Running Beer in BeerRunner");

        Beer Beer = new Beer();

       int quantity = 500;
	   Beer.drink(500);
	   int temprature = 5;
       Beer.store(5);
	   String Brand = "Heineken";
       Beer.chooseBrand("Heineken");

        String glasstype ="Pint Glass";
		int temperature = 4;
        Beer.serve("Pint Glass", 4);
		int duration = 7;
		double alchohalContent = 5.0;
        Beer.brew(7, 5.0);

        String PackagingType = "Bottle";
		int volume = 330;
		String label = "Classic Lager";
		Beer.packageBeer("Bottle", 330, "Classic Lager");
		
		String retailer ="Local Bar";
		double prize =3.39;
		int stock=200;
        Beer.sell("Local Bar", 3.99, 200);
    }
}