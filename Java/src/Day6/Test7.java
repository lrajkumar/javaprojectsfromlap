package Day6;

public class Test7 {
	public static void main(String[] args) {
		int age=-19;
		if(age>=0 && age<=18) {
			System.out.println("Teen age");
		}
		else if(age>18 && age<=60) {
			System.out.print("Adult");
			
		}
		else if(age>60) {
			System.out.println("old age");
		}
		else {
			System.out.println("not valid result");
		}
	}

}
