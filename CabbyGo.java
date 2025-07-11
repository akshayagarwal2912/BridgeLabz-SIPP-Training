public class CabbyGo {
	public static void main(String[] args) {
		//Object of Sedan class which is child class of Vehicle
		Vehicle HondaCity = new Sedan("Up85X0001",9.0,350,"Sedan");
		//Object of Suv class which is child class of Vehicle
		Vehicle Swift  = new SUV("Up85X0002",10.0,500,"SUV");
		//object of Driver class
		Driver driver1 = new Driver("abc","xyz123",4.5);
		Driver driver2 = new Driver("def","xyz456",4.2);
		
		//Object of ride class 
		Ride ride1 = new Ride();
		Ride ride2 = new Ride();
		
		//Booking a ride 
		ride1.bookRide(HondaCity, driver1, 90);
		ride2.bookRide(Swift, driver2, 60);
		
		//ending a ride 
		ride1.endRide(true);
		ride2.endRide(false);
	}
}


//Vehicle Class
class Vehicle{
	String VehicleNumber;
	int capacity;
	static double baseFare = 3000;
	String type;
	double charges;
	
	//Constructor of Class Vehicle
	public Vehicle(String VehicleNumber,double charges,int capacity,String type) {
		this.VehicleNumber = VehicleNumber;
		this.charges = charges;
		this.capacity = capacity;
		this.type = type;
	}
	
	//Display method
	public void display(){
		System.out.println("Vehicle Details");
		System.out.println("Vehicle Number is : "+this.VehicleNumber);
		System.out.println("Vehicle Capacity is : "+this.capacity);
		System.out.println("Vehicle Type is : "+this.type);
	}
	
	
	
}

//Class Mini is a child class of Vehicle Class
class Mini extends Vehicle{
	
	
	//Constructor of Mini Class
	public Mini(String VehicleNumber,double charges,int capacity,String type) {
		super(VehicleNumber,charges,capacity,type);
	}
	
	public void display() {
		super.display();
	}
}

//Class Sedan is a child class of Vehicle Class
class Sedan extends Vehicle{
	
	
	//Constructor of Sedan Class
	public Sedan(String VehicleNumber,double charges,int capacity,String type) {
		super(VehicleNumber,charges,capacity,type);
	}
	
	public void display() {
		super.display();
	}
}

//Class SUV is a child class of Vehicle Class
class SUV extends Vehicle{
	String VehicleNumber;
	int capacity;
	String type;
	double charges;
	
	//Constructor of SUV Class
	public SUV(String VehicleNumber,double charges,int capacity,String type) {
		super(VehicleNumber,charges,capacity,type);
	}
	
	public void display() {
		super.display();
	}
}

//Driver Class
class Driver{
	String Name;
	String licenseNumber;
	double rating;
	
	//Constructor of Driver class
	public Driver(String Name,String licenseNumber,double rating) {
		this.Name = Name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	//Display method
	public void displayInfo(){
		System.out.println("Driver Details Are:");
		System.out.println("Driver Name is : "+this.Name);
		System.out.println("Drive licenseNumber is : "+this.licenseNumber);
		System.out.println("Driver Rating is : "+this.rating);
	}
}

//Ride class
class Ride{
	Driver driver;
	Vehicle vehicle;
	double distance;
	boolean flag; // Checks ride is completed or not
	
	//Method for book a ride
	public void bookRide(Vehicle vehicle,Driver driver,double distance) {
		this.vehicle = vehicle;     // Store in instance variable
        this.driver = driver;
        this.distance = distance;
		System.out.println("Your Ride is booked successfully ");
	    System.out.println("Your Driver name is : "+driver.Name);
	    System.out.println("With Vehicle Type is :"+vehicle.type);
	    System.out.println("-----------------------------------------------------");
	}
	
	//Method for Ending a ride
	public void endRide(boolean flag) {
		if(!flag) {
			System.out.println("We are extremely sorry for not providing you a full ride");
			return;
		}
		System.out.println("Thanks for choosing CabbyGo");
		double totalCost = vehicle.baseFare + distance*vehicle.charges;
		System.out.println("Your total cost for the ride "+totalCost);
		System.out.println("-----------------------------------------------------");
	}
}
