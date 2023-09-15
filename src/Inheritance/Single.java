package Inheritance;

 class Singl {
	void Bike1() {
		System.out.println("R15");
	}

}
 public class Single extends Singl{
	 void car1(){
		 System.out.println("Tata");
		 
	 }
 }
 
  class Hlo {
	public static void main(String[] args) {
		Single v22=new Single();
		v22.Bike1();
		v22.car1();
	}
		
	}
 