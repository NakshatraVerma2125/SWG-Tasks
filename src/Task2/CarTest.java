package Task2;

public class CarTest {
	
	public static void main(String[] args) {
		Car car = new Car(180, 2000000, "Matte Black");
		
		Truck truck1 = new Truck(170, 3000000, "Red", 2500);

		Truck truck2 = new Truck(170, 3000000, "Red", 1800); // same specs as truck1 but different weight
		
		System.out.println("truck1 sale price: " + truck1.getSalePrice());

		System.out.println("truck2 sale price: " + truck2.getSalePrice());
	}
}
