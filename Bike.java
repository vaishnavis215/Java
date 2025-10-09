

public class Bike {
	  String brand;
	  int speed;
	  String fuel;
	  
	  void Start()
	  {
		  System.out.println("The bike belongs to "+ brand + " and has the top speed of " + speed + " and it has a "+ fuel + " Engine .");
	  }

	public static void main(String[] args) 
	{
		Bike b = new Bike();
		b.brand = "Yamaha";
		b.speed= 127;
		b.fuel= "petrol";
		
		
		b.Start();

	}

}