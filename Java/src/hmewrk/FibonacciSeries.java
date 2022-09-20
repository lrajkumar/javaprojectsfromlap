package hmewrk;

public class FibonacciSeries {
	public static void main(String[] args) {
		/*int n1=0;int n2=1; int n3=0;
		int count=10;
		
		//System.out.println(n1);
		//System.out.println(n2);
		for(int i=1;i<count;i++) {
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
		}*/
		
		///Using While 
		
		int k=0,a=1,b=1;
		

		System.out.println("1,1");
		
		while(k<=20) {
			k=a+b;
		
			System.out.println(k+" ");
			
			a=b;
			b=k;
		
			
		}
		
		
		
	}

}
