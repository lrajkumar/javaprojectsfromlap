package Day10;

public class MinimuminStringArray {
	public static void main(String[] args) {
		String[] name= {"Beast","RRR","VTV","Valimai","KGF","I"};
		int min=name[0].length();
		String s=" ";
		for(int i=0;i<name.length;i++) {
			if(name[i].length()<min) {
				min=name[i].length();
				s=name[i];
			}
			
			
			}
		System.out.println("the name is:"+s+","+"length: "+min);
		}
}
