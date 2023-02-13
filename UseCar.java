import java.util.Scanner;
import java.util.ArrayList;
public class UseCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyCarSystem s1 = new MyCarSystem();
		s1.start();
	}

}

class MyCarSystem{
	ArrayList<Car> cars = new ArrayList<Car>();
	public void start() {
		CarOwner owner = createOwner();
		Car myCar = new Car("Saab", "9-3", owner, 1000.00, 2005);
		
		Car car2 = new Car("Hyundi", "Sonata", owner, 8000.00, 2011);
		
		CarOwner mom = new CarOwner("Mom", "My parent's house");
		Car car3 = new Car("Honda", "CR-V", mom, 40000.00, 2018);
		
		cars.add(myCar);
		cars.add(car2);
		cars.add(car3);
		
		for (Car currentCar: cars) {
			System.out.println(currentCar);
		}
	}
	public CarOwner createOwner() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the name of the owner");
		String name = sc.nextLine();
		System.out.println("Enter the Address of the owner");
		String address = sc.nextLine();
		
		CarOwner cw = new CarOwner(name, address);
		
		return cw;
	}
}
