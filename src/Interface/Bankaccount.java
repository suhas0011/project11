package Interface;

public class Bankaccount implements Creditcard {

	public void rupees() {
		System.out.println("indian");
	}

	public void dollor() {
		System.out.println("usa");
		
	}

	public static void main(String[] args) {
    Bankaccount b1=new Bankaccount();
    b1.rupees();
    b1.dollor();
	}


}
