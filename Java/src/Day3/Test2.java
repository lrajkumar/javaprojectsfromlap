package Day3;

public class Test2 {
	public static void main(String[] args) {
		String name="cheguevar";
		String name1="Fidelcastro";
		String nameConcat=name.concat(name1);
		int nameLength=nameConcat.length();
		String upperConcatName=nameConcat.toUpperCase();
		String printHalf=upperConcatName.substring(0,9);
		
		System.out.println("concat name:"+nameConcat);
		System.out.println("Uppercase:"+upperConcatName);
		System.out.println("legth of the concat string:"+nameLength);
		System.out.println("print half string:"+printHalf);
		
	}

}
