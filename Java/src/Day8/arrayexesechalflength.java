package Day8;

public class arrayexesechalflength {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int temp=0;
		for(int i=5;i<a.length;i++) {
			System.out.println(a[i]);
			temp=temp+a[i];
			
		}
		System.out.println(temp);
	}

}
