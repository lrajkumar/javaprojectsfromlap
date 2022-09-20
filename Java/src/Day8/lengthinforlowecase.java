package Day8;

public class lengthinforlowecase {
	public static void main(String[] args) {
		int[] a= {95,90,80,75,96,96};
		int total=0;
		int temp=0;
		for(int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		temp=temp+a[i];
	
	}
		System.out.println("total ="+temp);
		System.out.println("Average "+(temp/6));

}
}
