package Loop;

public class Revers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 2538;
		int  reverse = 0;  
		while(number != 0)   
		{  
		int remainder = number % 10;  //2538%10 remainder is 8 //253%10 remainder is 3
		reverse = reverse * 10 + remainder; //0*10+8  revrse is 8  //8*10+3 reverse is 83
		number = number/10;//2538/10 is 253  //253/10 is 25
		}  
		System.out.println( reverse);  
	}

}
