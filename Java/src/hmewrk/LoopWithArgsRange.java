package hmewrk;

public class LoopWithArgsRange {
    
    public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		
		/* for(int i = start; i<= end; i++) {
		    System.out.println(i);
		} */
		
		
		for(int i = start; i >= end; i--) {
            System.out.println(i);
        }
	}
    

}
