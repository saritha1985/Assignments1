package saritha;

public class Type {

	public static void main(String[] args) {
		Quadrilateral square = new Quadrilateral();
		Quadrilateral rectangle = new Quadrilateral();
		Quadrilateral trapezoid = new Quadrilateral(4,1,"Trapozoid");
	square.setSides(4);
	square.setParllel(2);
	square.setName("Square");
	
	System.out.println(square.getName());
	System.out.println(square.getSides());
	System.out.println(square.getParllel());
	
	rectangle.setSides(4);
	rectangle.setParllel(2);
	rectangle.setName("Rectangle");
	
	System.out.println(rectangle.getName());
	System.out.println(rectangle.getSides());
	System.out.println(rectangle.getParllel());
	
	System.out.println(trapezoid.getName());
	System.out.println(trapezoid.getSides());
	System.out.println(trapezoid.getParllel());
	
	
	
	
		

	}

}
