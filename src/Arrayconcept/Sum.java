package Arrayconcept;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40};//length of an array value is 4
                  //0,,1,,2,,,3		
		int sum =0;
		for (int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		///sum=0+arr[0]            //sum=10+arr[1]
			//=0+10  =10           // sum=10+20=30
		}
		System.out.println(sum);

	}

}
