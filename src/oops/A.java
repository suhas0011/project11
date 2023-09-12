package oops;

public class A {
	public void car() {
		System.out.println("toyoto");
	}
}
 class B extends A {
	 public void car() {
		 System.out.println("fortuner");
	 }
 }
 
      class C  {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B s= new B();
		s.car();
	}
}


