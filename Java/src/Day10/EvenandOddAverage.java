package Day10;

public class EvenandOddAverage {
	public static void main(String[] args) {
		
		int total=0;
		
		int totalOdd=0;
		int countEven=0;
		int countOdd=0;
		int averageEven=0;
		int averageOdd = 0;
		int a=50;
		for(int i=0;i<=a;i++) {
			if(i%2==0) {
			 countEven=countEven+1;
			 total=total+i;
			 
			 averageEven=total/countEven;
			}
			else {
				countOdd=countOdd+1;
				countEven=countEven+1;
				
				 
				totalOdd=totalOdd+i;
				 averageOdd=totalOdd/countOdd;
			}
		}
		System.out.println("Count even:"+countEven+", "+"Count Odd:"+countOdd);
		System.out.println("Total even: "+total+", "+"Total Odd: "+totalOdd);
		System.out.println("Average even numbers: "+averageEven+", "+"Average odd numbers "+averageOdd);
		
	}

}
