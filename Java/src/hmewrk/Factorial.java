package hmewrk;

public class Factorial {
     public static void main(String[] args) {
    	 String[] a=args[0].split(",");
    	 int n1=Integer.parseInt(a[0]);
    	 int n2=Integer.parseInt(a[1]);
    	 int n3=Integer.parseInt(a[2]);
    	 int n4=Integer.parseInt(a[3]);
    	 int n5=Integer.parseInt(a[4]);
    	 
    	
    	 int[] num= {n1,n2,n3,n4,n5};
    	 int max=1;
    	 
    	 for(int i=num.length;i>=1;i--) {
    		 if(num[i]>max) {
    			 max=num[i];
    		 max=max*i;
    	 }
     }
     
     System.out.println(max);	 
}
}
     
    /* for(int i=max;i>=1;i--) {
    	 if(max>1) {
    		 max=max*i;
    	 }
     
    	 }*/
   

