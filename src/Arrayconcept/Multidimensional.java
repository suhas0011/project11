package Arrayconcept;

public class Multidimensional {

	public static void main(String[] args) {
		 int[][] input = {{2,6,8},{45,23,1},{35,6,9}};

		    System.out.println("Min Number : "+ getMinNumber(input));
		 }
		 
		public static int getMinNumber(int[][] array) {
			int minNumber = array[0][0];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					if (array[i][j] < minNumber) {
						minNumber = array[i][j];
					}
				}
			}
			return minNumber;
	}

}
