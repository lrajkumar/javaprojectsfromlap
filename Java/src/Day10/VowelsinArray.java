package Day10;

public class VowelsinArray {
	public static void main(String[] args) {
		String[] name= {"Beast","RRR","VTV","Valimai","KGF","I"};
		int count=0;
		int count1=0;
		for(int i=0;i<name.length;i++) {
			if(name[i].contains("a")||name[i].contains("e")||name[i].contains("i")||name[i].contains("o")||name[i].contains("u")){
				System.out.println(name[i]);
				count=count+1;
			}
			else {
				count1=count1+1;
			}
				
			}
				System.out.println("Vowels Count: "+count);
				System.out.println("consolent words: "+count1);
				
				
				
				int max=0;
				String s="";
				for(int i=0;i<name.length;i++) {
					if(name[i].length()>max) {
						max=name[i].length();
						s=name[i];
						
					}
				}
				System.out.println("name is"+s+","+"length is "+max);		
	}
		

}
