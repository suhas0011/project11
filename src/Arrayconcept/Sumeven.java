package Arrayconcept;

public class Sumeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {12,21,32,43,50};
		int sum1=0;
		int sum2=0;
		int  count1=0;
		int count2=0;
		int count1avg,count2avg;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==1)
			{
				sum1=sum1+arr[i];
				count1++;
			}
			else {
				sum2=sum2+arr[i];
				count2++;
			}
				
		}
		count1avg=sum1/count1;
		count2avg=sum2/count2;

System.out.println("sum of odd number "+sum1);
System.out.println("sum of even number "+sum2);
System.out.println("Average of odd numbers are: "+count1avg);   
System.out.print("Average of even numbers are: "+count2avg);


	}

}
