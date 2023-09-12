package Arrayconcept;

public class Lastdigitmain {
	public int last(int num) {
		int rem=num%10;
		return rem;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lastdigitmain m=new Lastdigitmain();
		 int resu=m.last(1289);
		 System.out.println(resu);

	}

}
