package Day8;

public class arrayprimitiveeven {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int temp=1;
		for(int i=1;i<a.length;i=i+2) {
		temp=temp+i;	
		  System.out.println(a[i])	;
		}
		 System.out.println(temp)	;
	}

}
