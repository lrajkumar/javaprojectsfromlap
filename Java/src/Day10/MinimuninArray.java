package Day10;

public class MinimuninArray {
	public static void main(String[] args) {
		int[] num= {22,33,44,-10,-20,-30};
		int min=num[0];
		for(int i=0;i<num.length;i++) {
			if(num[i]<min) {
				min=num[i];
				
			}
		}
		System.out.println(min);
	}

}
