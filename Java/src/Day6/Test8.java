package Day6;

public class Test8 {
	public static void main(String[] args) {
		int mark=38;
		
		if(mark>=90) {
			System.out.println("s garde");
		}
		else if(mark<=90 && mark>=80){
			System.out.println("A grade");
		}
		else if(mark<=70 && mark>=80) {
			System.out.println("B grade");
		}
		else if(mark<=60 && mark>=50) {
			System.out.println("C grade");
		}
		else if(mark<=50 && mark>=40) {
			System.out.println("D Grade");
		}
		else if(mark<=40 && mark>=35) {
			System.out.println("E Grade");
		}
		else if(mark<35) {
			System.out.println("U Grade");
		}
		else {
			System.out.println("Invalid result");
		}
	}
}
