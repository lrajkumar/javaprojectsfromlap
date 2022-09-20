package InterviewProgram;

import java.util.Scanner;

public class ReverseNum {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int num;
	 int rev=0;
		 System.out.println("Enter num");
		num=sc.nextInt();
		/*while(num!=0) {
			rev=rev*10+num%10;  //0  +1234/10->4 (( rev*10=40 +num%10=3)==43)-- ((rev=43*10+num%10=(12%10==2)==432
			num=num/10;    //1234/10---123---123/10--12----12/10=1
		}*/
			//System.out.println(rev);
		// Using String buffer Class 
			
			StringBuffer sb=new StringBuffer(String.valueOf(num));
			StringBuffer reverse=sb.reverse();
			System.out.println(reverse); 
	 	
		//Using String Builder
		/*StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder reverse=sbl.reverse();
	 System.out.println(reverse); */
	 
	 
 }
}
