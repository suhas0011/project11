package Inheritance;

 class Instagram {
	void hlo(){
		System.out.println("hlooo");
	}
}
	
	class Story extends Instagram {
		void hii() {
			System.out.println("hiii");
		}
	}
	class Reels extends Instagram{
		void hmm() {
			System.out.println("heyyy");
		}
	}
	
	
class Insta{
	public static void main(String[] args) {
		Story s1=new Story();
		s1.hii();
		s1.hlo();
		Reels r1=new Reels();
		r1.hmm();
		r1.hlo();
	}

}
