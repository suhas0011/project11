package Inheritance;

public class Single {
	void Bike() {
		System.out.println("R15");
	}

}
  class Vehicle22 extends Single{
	 void car(){
		 System.out.println("Tata");
		 
	 }
 }
  class Vehicle39{
	public static void main(String[] args) {
		Vehicle22 v1=new Vehicle22();
		v1.Bike();
		v1.car();
	}
		
	}