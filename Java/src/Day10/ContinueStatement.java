package Day10;

public class ContinueStatement {
	public static void main(String[] args) {
		int a=10;
		for(int i=0;i<=a;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
