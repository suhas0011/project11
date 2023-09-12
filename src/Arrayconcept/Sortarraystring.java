package Arrayconcept;

import java.util.Arrays;

public class Sortarraystring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numericArray = { 5, 2, 9, 1, 5, 6 };
		String[] strr= {"rs","fz3","R15 "};
      // Sorting the array
        Arrays.sort(numericArray);

        System.out.println("Sorted Array: " + Arrays.toString(numericArray));
        Arrays.sort(strr);
        System.out.println(Arrays.toString(strr));
        
	}

}
