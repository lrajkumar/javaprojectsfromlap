package Day10;

public class LengthinName {
	public static void main(String[] args) {
	String name="WeLcOmE";
	String name1=name.toLowerCase();
	int count=0;
	for(int i=0;i<name.length();i++) {
		if(name1.contains("a")||name1.contains("e")||name1.contains("i")||name1.contains("o")||name1.contains("u")) {
			count=count+1;
			
		}
		
	}
	System.out.println(count);
	
	}
}