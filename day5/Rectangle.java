package day5;

public final class Rectangle extends Shape{
	private int length, breadth;
	
	public Rectangle() {
	
	}

	public Rectangle(int thickNess, String borderColor, int length, int breadth) {
		super(thickNess, borderColor);
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public void draw() {
		System.out.println("Drawing a rectangle with following specifications: ");
		System.out.println("Thickness: " + this.getThickNess());
		System.out.println("Border Color: " + getBorderColor());
		System.out.println("Length: " + length);
		System.out.println("Breadth: " + breadth);
		
	}

}


