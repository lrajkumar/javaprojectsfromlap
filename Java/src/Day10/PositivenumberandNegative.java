package Day10;

public class PositivenumberandNegative {
           public static void main(String[] args) {
        	   int[] num= {22,33,44,-10,-20,-30};
        	   int count=0;
        	   int count1=0;
        	   for(int i=0;i<num.length;i++) {
        		   if(num[i]>=0) {
        			   count=count+1;
        		   }
        		   else {
        			   count1=count1+1;
        		   }
        	   }
        	   System.out.println("positive count: "+count+", "+"negative count: "+count1);
        	   
           }
}
