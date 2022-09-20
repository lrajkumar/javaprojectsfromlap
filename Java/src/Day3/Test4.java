package Day3;

public class Test4 {
	public static void main(String[] args) {
		String name="Valdimarllychlenin";
		String []a=name.split("y");
		int nameLength=name.length();
		String nameHalf=name.substring(0,8);
		boolean nameContains=name.contains("mar");
		String name1="Lenin";
		boolean check=name.equals(name1);
		String nameUpperCase=name.toUpperCase();
		boolean checkLastLetter=name.endsWith("in");
		System.out.println("length of the String:"+nameLength);
		System.out.println("print name in uppercase:"+nameUpperCase);
		System.out.println("check the string ends with in:"+checkLastLetter);
		System.out.println("print letter:"+name.charAt(0)+" "+name.charAt(4)+" "+name.charAt(5)+" "+name.charAt(11)+" "+name.charAt(17));
		System.out.println("index value:"+name.indexOf("a")+" "+name.indexOf("m")+" "+name.indexOf("c")+" "+name.indexOf("n")+" "+name.indexOf("i"));
		System.out.println("half string:"+nameHalf);
		System.out.print("check letter mar:"+nameContains);
		System.out.println("check string equals to lenin:"+check);
		System.out.println("print string:"+a[0]+" "+a[1]);
		
	}

}
