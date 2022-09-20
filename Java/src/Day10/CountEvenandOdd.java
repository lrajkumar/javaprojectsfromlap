package Day10;

public class CountEvenandOdd {
	public static void main(String[] args) {
		int countEven=0;
		int countOdd=0;
		int a=50;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
				countEven=countEven+1;
			}
			else {
				countOdd=countOdd+1;
				
			}
		}
		System.out.println("Even Count:"+countEven+","+"Odd Count:"+countOdd);
	}

}
