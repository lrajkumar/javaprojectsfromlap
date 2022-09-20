fpackage InterviewProgram;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		
		int x;
		int y;
		Scanner i=new Scanner(System.in);
		System.out.println("Enter x value:");
		x=i.nextInt();
		
		Scanner l=new Scanner(System.in);
	System.out.println("Enter the y value :");
		y=i.nextInt();
		
		//int x=10;
		//int y=5;
		/*x=x*y; //x now becomes 50
		System.out.println(x);
		y=x/y;  //y becomes 10
		System.out.println(y);
		x=x/y;  //x becomes 5*/
		
		
		x=x+y;  //15
		y=x-y;   //10;
		x=x-y;   //15-10=5;
	
		System.out.println("After Swapping: "+"x="+x+", "+"y= "+y);
	}

}
