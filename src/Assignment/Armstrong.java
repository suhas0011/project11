package Assignment;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
 Scanner input=new Scanner(System.in);
 System.out.println("enter the number");
 int number= Integer.parseInt(input.next());
 int armstrongnumber = number;
 int num=number;
 int added=0;
 int count=0;
 while (num>0) {
	 count=count+1;
	 num=num/10;
	 
 }
 while (num>0) {
	int rem=num%10;
	 added=(int)(added+(Math.pow(rem, count)));
	 number=number/10;
	 
 }
 if( armstrongnumber==added) {
	 System.out.println(armstrongnumber+"is an armstrong number");
 }else {
	 System.out.println(armstrongnumber+"is not1 an armstrong number");
 
 }
 
 
	}

}
