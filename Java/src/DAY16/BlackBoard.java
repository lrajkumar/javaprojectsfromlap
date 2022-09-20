package DAY16;

public class BlackBoard implements Board {
	public String write() {
		return "write use of chalkpiece";
		
	}
	
	public static void main(String[] args) {
		BlackBoard bb=new BlackBoard();
		System.out.println(bb.write());
	}
       
}
