package inheritance;


public class Multil {
	void bike() {
		System.out.println("RX100");
	}

}
class Vehicle37 extends Multil{
	void car() {
		System.out.println("toyoto");
	}
}
class Vehicle3 extends Vehicle37{
	void car2() {
		System.out.println("creta");
	}
}

class Vehicle33{
	public static void main(String[] args) {
		Vehicle3 v1=new Vehicle3();
		v1.bike();
		v1.car();
		v1.car2();
	}
		
	}