package oops;

public class methodoverload {
		public void car(int a) 
		{
			System.out.println(a);
		}
		public void car(String txt) 
		{
			System.out.println(txt);
			
		}
		public void car(int a,String txt) 
		{
			System.out.println(txt);
			
		}
		
		public static void main (String[] args)
		{
			methodoverload m1= new methodoverload();
			m1.car(23);
			m1.car("suhas");
			m1.car(22, "suhas");
		}

	}


