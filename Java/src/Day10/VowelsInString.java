package Day10;

public class VowelsInString {
	public static void main(String[] args) {
		String name="WeLcOmE";
		String name1=name.toLowerCase();
		int count=0;
		for(int i=0;i<name.length();i++) {
			char ch=name1.charAt(i);
			if(ch==('a')||ch==('e')||ch==('i')||ch==('o')||ch==('u')) {
			count=count+1;
			
		}
	}
		System.out.println(count);
	}

}
