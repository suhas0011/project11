package conditions;
public class passed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maths=50;
		int science=44;
		int english=45;
		int french=70;
		if(maths>=50 && science>=44 && (english>=55 || french>=70)){
			System.out.println("students are promoted");
		}
		else {
			System.out.println("students are not promoted");
		}

	}

}
