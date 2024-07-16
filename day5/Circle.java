package day5;

public class Circle extends Shape {
	private int radius;
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	public Circle(int thickNess, String borderColor, int radius) {
		super(thickNess, borderColor);
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a circle with following specifications: ");
		System.out.println("Thickness: " + getThickNess());
		System.out.println("Border Color: " + getBorderColor());
		System.out.println("Radius: " + radius);
	}

}
