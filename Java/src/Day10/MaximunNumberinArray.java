package Day10;

public class MaximunNumberinArray {
	public static void main(String[] args) {
 	   int[] num= {22,33,44,-10,-20,-30};
 	   int max=0;
 	   for(int i=0;i<num.length;i++) {
 		   if(num[i]>max) {
 			   max=num[i];
 			   
 		   }
 		   
 	   }
 	   System.out.println(max);
 	   
	}
}
