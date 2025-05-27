package hw5;

public abstract class Pen {
	protected String brand;
	protected double price;
	
	public Pen() {};
	public Pen(String brand, int price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public void getPrice() {
		System.out.println(this.price);
		
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public abstract void setPrice(double price) ;
	
	public abstract void write();
	
}

class Pencil extends Pen{
	
	
	public void setPrice(double price) {
		this.price = price * 0.8;
	}
	
	public void write() {
		System.out.println("削鉛筆再寫");
	};
}	
class InkBrush extends Pen{
	
	public void setPrice(double price) {
		this.price = price * 0.9;
	}
	
	public void write() {
		System.out.println("沾墨汁再寫");
	};
		
}

