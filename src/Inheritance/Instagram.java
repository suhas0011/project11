package Inheritance;

 class Insta {
	void hlo(){
		System.out.println("hlooo");
	}
}
	
	class Story extends Insta {
		void hii() {
			System.out.println("hiii");
		}
	}
	class Reels extends Insta{
		void hmm() {
			System.out.println("heyyy");
		}
	}
	
	
public class Instagram{
	public static void main(String[] args) {
		Story s1=new Story();
		s1.hii();
		s1.hlo();
		Reels r1=new Reels();
		r1.hmm();
		r1.hlo();
	}

}
