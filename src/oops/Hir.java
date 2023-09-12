package oops;

public class Hir { 
	void A() {
		System.out.println("R15");
	}

}
  class Hii extends Hir{
	  void B() {
		  System.out.println("Rs");
	  }
  }
  class Hlo extends Hir{
	  void c() {
		  System.out.println("Himalayan");
	  }
  
   
  public static void main(String[] args) {
	  Hlo s1=new Hlo();
	  s1.c();
	  s1.A();
	  
  }
  }