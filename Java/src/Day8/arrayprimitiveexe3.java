package Day8;

public class arrayprimitiveexe3 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int temp=0;
		int count=0;
		for(int i=0; i<a.length/2;i++) {
			System.out.println(a[i]);
			temp=temp+a[i];
			count=count+1;
		}
		System.out.println(count);
		
		System.out.println(temp);
	

}
}



