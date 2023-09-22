package Interface1;

 interface call {
void vehicle();
}
interface vehicle8 extends call{
	void Vehicle39();
}
class Vehicle3  implements vehicle8{
	public void vehicle(){
		System.out.println("car");
	}

	@Override
	public void Vehicle39() {
		// TODO Auto-generated method stub
		System.out.println("bike");
	}
	
	public static void main(String[] args) {
		Vehicle3 v=new Vehicle3();
		v.vehicle();
		v.Vehicle39();
	}

	
}