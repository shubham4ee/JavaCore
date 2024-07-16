package day5;

public class AbstractClassExampleMain {

	public static void main(String[] args) {
		Shape sh;
		sh = new Rectangle(5, "Red", 20, 15);
		sh.draw();
		sh.erase();
		System.out.println("---------------------");
		sh = new Circle(2, "Blue", 7);
		sh.draw();
		sh.erase();

	}

}
