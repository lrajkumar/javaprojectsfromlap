package Day6;

public class Test9 {
	public static void main(String[] args) {
		int sachinSc=10;
		int viratSc=90;
		int dhoniSc=90;
		String a="Sachin";
		String b="Virat";
		String c="Dhoni";
		
		
		if(sachinSc>viratSc && sachinSc>dhoniSc) {
			System.out.println("highest score:"+(a));
		}
		
		else if(viratSc>sachinSc && viratSc>dhoniSc) {
			System.out.println("highest score:"+(b));
		}
		else if(dhoniSc>sachinSc && dhoniSc>viratSc) {
			System.out.println("highest score:"+(c));
		}
		else if(dhoniSc==viratSc && dhoniSc==sachinSc && sachinSc==viratSc) {
			System.out.println("all the three are high score");
		}
		else if(dhoniSc==sachinSc) {
			System.out.println("dhoni and Sachin are Highest score");
		}
		else if(sachinSc==viratSc) {
			System.out.println("virat and sachin are highest score");
		}
		else if(dhoniSc==viratSc) {
			System.out.println("dhoni and virat are highest score");
		}
		
		
		else {
			System.out.println("Invalid result");
		}

}
}
