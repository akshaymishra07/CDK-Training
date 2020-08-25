package assignmentshape;

public class Circle extends Shape implements Calculation {

	private double radius;

	public Circle() {
		super("Circle");
		// TODO Auto-generated constructor stub
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {

		return 3.14 * radius * radius;

	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * 3.14 * radius;
	}

}
