package Accessmodifier;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bus m=new bus();
		m.A();
		m.b();

	}

}
 class bus{
	
	 
	 protected void A(){
		 System.out.println("this is car");
	 }
	 public void b() {
		 System.out.println("fortuner");
	 }
	 private void c() {
		 System.out.println("baleno");
	 }
	
 }
