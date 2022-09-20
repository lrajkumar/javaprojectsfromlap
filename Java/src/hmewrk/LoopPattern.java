package  hmewrk;
		// 1, 1
		// 1, 2
		// 1, 3
		// 1, 4hmewrk;

        
public class LoopPattern {

    public static void main(String[] args) {

		/* for(int i = 0; i < 5; i++ ) {
            for(int j = 5; j > i; j-- ) {
//              System.out.println("i:" + i + "--> j:" + j);
                System.out.println("*");
            }
            
            System.out.println("");
		} */
		
		int result = 1;
		for(int i = 5; i > 0; i--) {
		    result =  result * i;
		}
		
		System.out.println(result);
		
		// i, j
		// 0, 0
		// 0, 1
		// 0, 2
		// 0, 3
		// 0, 4
		// 2, 0
        		// 2, 1
        		// 2, 2
        		// 2, 3
        		// 2, 4

// 0 -> 5
// 1 -> 4
// 2 -> 3
// 3 -> 2
// 4 -> 1

						
        }
                
//         System.out.print("*");


	}


