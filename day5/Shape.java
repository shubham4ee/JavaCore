package day5;

abstract public class Shape {
	private int thickNess;
	private String borderColor;
	public Shape() {
		// TODO Auto-generated constructor stub
	}
	
	public Shape(int thickNess, String borderColor) {
		this.thickNess = thickNess;
		this.borderColor = borderColor;
	}

	public int getThickNess() {
		return thickNess;
	}

	public void setThickNess(int thickNess) {
		this.thickNess = thickNess;
	}

	public String getBorderColor() {
		return borderColor;
	}

	public void setBorderColor(String borderColor) {
		this.borderColor = borderColor;
	}

	public abstract void draw();
	final public void erase() {
		System.out.println("Erasing the shape...");
	}
}

