package Day10;

public class VowelsinString1 {
	public static void main(String[] args) {
		String name="OrAnGe";
		String name1=name.toLowerCase();
		int count=0;
		int count1=0;
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			char ch1=name1.charAt(i);
			if(ch==ch1) {
				count=count+1;
			}
			else {
				count1=count1+1;
			}
		}
		System.out.println("lower case count: "+count+", "+"uppercase count: "+count1);
		
		
	}

}
