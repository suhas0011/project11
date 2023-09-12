package demopackage;

public class Demo2class {
static int c=20;//static variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("hii");
		Practical d1= new Practical();//creating object
		Pract d2=new Pract();//creating object
		Tvs t1=new Tvs();//creating object
		d1.home();//call for non static method
		d2.house();//call for non static method
		t1.om();//call for non static method
		System.out.println(t1.str);//call for non static variable
		System.out.println(Practical.i);//call for non static variable
		System.out.println(Pract.w);//call for non static variable
	
	}

}

class Practical{
	 static int i=33;//static variable
	 String s1="hlooo";//non static variable
	 public void home() {
		 System.out.println("i am var");
		 int s=200;//local variable
		 System.out.println(s);//call for local variable
	 }
}
	 class Pract{
		 static int w=22;
		 int t=29;//reference variable
		 protected void house() {
			 int ar =20;//local variable
			 System.out.println("i am car");
			 System.out.println(ar);//call for local variable
		 }
	 }
class Tvs{
	static int h=77;//static variable
	 String str="i am strstr";//non static variable
	 void om() {
		 int su=333;//local variable
		 System.out.println(su);//call for local variable
		System.out.println("hlo");
	 }
}
