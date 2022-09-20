package DAY12;

public class HighestPrice {
	public int max(int a,int b,int c) {
		int m=0;
		int []n= {a,b,c};
		for(int i=0;i<n.length;i++) {
			if(n[i]>m) {
				m=n[i];
			}
		}
		return m;
	}

}
