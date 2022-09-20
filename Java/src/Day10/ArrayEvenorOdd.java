package Day10;

public class ArrayEvenorOdd {
	public static void main(String[] args) {
		int[] num= {22,33,44,-10,-20,-30};
		for(int i=0;i<num.length;i++) {
			
			if(i%2==0) {
				System.out.println(num[i]);
			}
		}
	}

}
