package Day10;

public class MaximuminStringArray {
	public static void main(String[] args) {
		String[] name= {"Beast","RRR","VTV","Valimai","KGF","I"};
		int max=0;
		String s=" ";
		for(int i=0;i<name.length;i++) {
			
			if(name[i].length()>max) {
				max=name[i].length();
				s=name[i];
			}
		}
		System.out.println(max);
		System.out.println("the name is:"+s+","+"length: "+max);
	}
}
