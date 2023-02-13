
public class Car {
	// instance variables
	private String model;
	private int year;
	private String make;
	
	private double price;
	
	
	// aggregation relationship
	private CarOwner carOwner;
	
	public Car(String model, String make, CarOwner carOwner, Double price, int year) {
		super();
		this.model = model;
		this.carOwner = carOwner;
		this.price = price;
		this.make = make;
		this.year = year;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	public CarOwner getCarOwner() {
		return carOwner;
	}
	public void setCarOwner(CarOwner carOwner) {
		this.carOwner = carOwner;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getMake() {
		return make;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear(int year) {
		return year;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", make=" + make + ", \ncarOwner=" + carOwner 
				+  ", \nPrice=$" + price + ", year="+ year + "] \n" ;
	}
	
}

