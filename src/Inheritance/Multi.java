package Inheritance;
class Vehicle {
	void bike() {
		System.out.println("RX100");
	}

}
class Vehicle37 extends Vehicle{
	void car13() {
		System.out.println("toyoto");
	}
}
class Vehicle3 extends Vehicle37{
	void car2() {
		System.out.println("creta");
	}
}

class Multi{
	public static void main(String[] args) {
		Vehicle3 v1=new Vehicle3();
		v1.bike();
		v1.car13();
		v1.car2();
	}
		
	}