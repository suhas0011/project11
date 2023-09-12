package demopackage;

public class Democlass {

	public static void main(String[] args) {
		System.out.println("hii");
Suhas d1= new Suhas();
Prajwal d2=new Prajwal();
Tvv t1=new Tvv();
d1.bangalore();
d2.chennai();
System.out.println(t1.str);
System.out.println(d1.i);
	}

}
 class Suhas{
	 int i=33;
	 public void bangalore() {
		 System.out.println("i am from bangalore");
	 }
 }
	 class Prajwal{
		 public void chennai() {
			 System.out.println("i am from karnataka");
		 }
	 }
 class Tvv{
	 String str="i am from shimoga";
 }
