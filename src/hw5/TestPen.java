package hw5;

public class TestPen {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		InkBrush p2 = new InkBrush();
		p1.write();
		p2.write();
		p1.setPrice(30);
		p2.setPrice(50);
		p1.getPrice();
		p2.getPrice();
	}
}
