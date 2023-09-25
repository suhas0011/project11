package Assignment;

public class Armstr {

	public static void main(String[] args) {
		int num=1634,originalnumber,rem,res=0;
		originalnumber=num;
		while(originalnumber!=0)
		{
			rem=originalnumber%10;
			res+=Math.pow(rem, 4);
			originalnumber/=10;
			
			
		}
		 if( res==num) {
			 System.out.println(num+ "is an armstrong number");
		 }else {
			 System.out.println(num+ "is not1 an armstrong number");
		 
		 }
		 

	}

}
