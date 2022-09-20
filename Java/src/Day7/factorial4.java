package Day7;

public class factorial4 {
	public static void main(String[] args) {
		int temp=1;
		for(int i=60;i>=12; i=i-12) {
			temp=temp*i;
		}
		System.out.println(temp);
	}

}
