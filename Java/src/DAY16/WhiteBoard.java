package DAY16;

public class WhiteBoard implements Board {
         public String write() {
         return "Write use of marker";
         
         }
         public static void main(String[] args) {
        	 WhiteBoard w=new WhiteBoard();
        	 System.out.println(w.write());
        	 
         }
}
