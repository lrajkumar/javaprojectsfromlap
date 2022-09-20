package InterviewProgram;

public class Palindrome {
	public static void main(String[] args) {
		String a="liril";
		String rev="";
		//char[] a1=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--) {
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		if(a.equalsIgnoreCase(rev)) {
			
			System.out.println("It is a Palindrome");
		}
		else {
			
			System.out.println("It is not a Palindrome");
		}
		
	}
	
}
