package DAY15;

public class Keypad extends Landline {
	public void text() {
		System.out.println("texting");
		
	}
    public static void main(String[] args) {
    	Keypad k=new Keypad();
    	k.call();
    	k.text();
    	
    	
    }
}
