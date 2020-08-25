package assignmentshape;

public class TestShape {

	public static void main(String[] args) {

		Circle circle = new Circle(12.5);
		Rectangle rectangle = new Rectangle(50.0, 70.75);
		Square square = new Square(30.25);

		System.out.println(
				"Area of Square       : " + square.area() + "  Perimeter of Square   :  " + square.perimeter());
		System.out.println(
				"Area of Rectangle    : " + rectangle.area() + "    Perimeter of Rectangle:  " + rectangle.perimeter());
		System.out.println(
				"Area of Circle       : " + circle.area() + "   Perimeter of Circle   :  " + circle.perimeter());
	}

}
