package assignmentshape;

public class Square extends Shape implements Calculation {

	private double side;

	public Square() {
		// TODO Auto-generated constructor stub
	}

	public Square(double side) {
		super("Square");
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return side * side;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 4 * side;
	}

}
