package Day10;

public class IfelseinVowels {
	public static void main(String[] args) {
		String name="WeLcOmE";
		String name1=name.toLowerCase();
		int counteven=0;
		int countodd=0;
		for(int i=0;i<name1.length();i++) {
			char ch=name1.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				counteven=counteven+1;
			}
			else {
				countodd=countodd+1;
			}
		}
		System.out.println("EVE COUNT: "+counteven);
		System.out.println("ODD COUNT: "+countodd);
	}

}
