package Arrayconcept;

import java.util.Arrays;

public class Sortstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Bike = {"R15", "Himalayan", "RS", "FZ"};
		int size=Bike.length;
		for(int i = 0; i<size-1; i++) 
		{
			for (int j = i+1; j<Bike.length; j++) 
			{
				if(Bike[i].compareTo(Bike[j])>0)
				{   
					String temp = Bike[i];  
					Bike[i] = Bike[j];  
					Bike[j] = temp;  
				}

			}

		}

		System.out.println(Arrays.toString(Bike));  



	}

}
