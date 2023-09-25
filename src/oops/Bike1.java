package oops;
class Bike2{  
	  void run()
	  {
		  System.out.println(" running");
		  }  
	}  
	class Bike extends Bike2 {
	void run()
	{
		System.out.println("Hlooo");
	}
	}
	 
	 class Bike1{
	  public static void main(String args[])
	  {  
	  Bike obj = new Bike();  
	  obj.run();  
	  }  
	  }
