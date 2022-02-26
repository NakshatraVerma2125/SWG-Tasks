package Task2;

public class Car {
	int speed;
	double regularPrice;
	String color;
	
	// constructor
	public Car(int speed, double regularPrice, String color) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.color = color;
	}
	
	public double getSalePrice() {
		return regularPrice;
	}
}

class Truck extends Car {
	int weight;
	
	// constructor
	public Truck(int speed, int regularPrice, String color, int weight) {
		super(speed, regularPrice, color); // invoke parent class constructor
		this.weight = weight;
	}
	
	public double getSalePrice() {
		if(this.weight > 2300) {
			return (regularPrice - 0.1*regularPrice); 
		}
		else {
			return (regularPrice - 0.2*regularPrice);
		}
	}
}