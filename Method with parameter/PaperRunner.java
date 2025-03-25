public class PaperRunner {
    public static void main(String[] args) {
        System.out.println("Running Paper in PaperRunner");
			Paper Paper = new Paper();
		String text = "hello";
        Paper.write(text);
		String style = "Original";
        Paper.fold(style);
		String shape ="Cirlce";
        Paper.cut(shape);
		
        String method ="shredding";
        int quantity = 50;
        Paper.recycle("Shredding", 50);
        Paper.print("Java Assignment", 10);

        String finish = "Glossy";
		double thickness =0.5;
		String size = "A4";
        Paper.laminate("Glossy", 0.5, "A4");
		String design ="Floral";
		String color ="Blue";
		String theme ="Birthday Card"; 
       Paper.decorate("Floral", "Blue", "Birthday Card");
    }
}
