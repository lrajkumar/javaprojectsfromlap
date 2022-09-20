package hmewrk;

public class LoopIterationMultipleSteps {

	public static void main(String[] args) {
		/* for (int i = 0; i < 20; i = i + 6) {
			System.out.println(i);
		}
 */
	 	/* for (int i = 1; i < 5; i++) {
			System.out.println(i + 6);
		} */
		
		int total = 0;
		for (int i = 0; i < 5; i++) {
            //total = total + i;
            total += i;
        }
        
        System.out.println(total);
	}
}
