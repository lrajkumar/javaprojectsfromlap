package DAY12;

public class Data2 {
	public String pal (String a) {
		String s="";
		char[] ch=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--) {
			s=s+ch[i];
		}
		if(s.equals(a)) {
			return "It is a palindrome";
		}
		else{
			return "it is not a palindrome";
	}

}
}
