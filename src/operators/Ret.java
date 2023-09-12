package operators;

public class Ret {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motor m1=new Motor();
		m1.r15();
		int d=m1.add(20, 30);
		System.out.println(d);

	}

}
 class Motor{
	 public void r15(){
		 System.out.println("this is r15");
	 }
	 public int add( int a,int b) {
		 int c=a+b;
		 return c;
	 }
 }