public class Paper {

    public void write(String text) {
        System.out.println("Writing on paper: " + text);
    }

    public void fold(String style) {
        System.out.println("Folding paper in " + style + " style.");
    }

    public void cut(String shape) {
        System.out.println("Cutting paper into " + shape + " shape.");
    }

    public void recycle(String method, int quantity) {
        System.out.println("Recycling " + quantity + " sheets of paper using " + method + " method.");
    }

    public void print(String content, int copies) {
        System.out.println("Printing " + copies + " copies of: " + content);
    }
	
    public void laminate(String finish, double thickness, String size) {
        System.out.println("Laminating paper with " + finish + " finish, " + thickness + "mm thickness, size " + size + ".");
    }

    public void decorate(String design, String color, String theme) {
        System.out.println("Decorating paper with " + design + " design in " + color + " color for a " + theme + " theme.");
    }
}