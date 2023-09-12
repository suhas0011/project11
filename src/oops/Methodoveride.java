package oops;
class Methodoveride{  
	  void run()
	  {
		  System.out.println(" running");
		  }  
	}  
	    //Creating a child class  
	class Bike extends Methodoveride
	{  
	  public static void main(String args[])
	  {  
	  //creating an instance of child class  
	  Bike obj = new Bike();  
	  //calling the method with child class instance  
	  obj.run();  
	  }  
	}  

