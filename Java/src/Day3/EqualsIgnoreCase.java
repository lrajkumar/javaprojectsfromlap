package Day3;

public class EqualsIgnoreCase {
	public static void main(String[] args) {
		String name="sanju";
		System.out.println(name.equalsIgnoreCase("SANJU"));
		String name1="Samson";
		System.out.println(name1.equalsIgnoreCase("SAMSON"));
		System.out.println(name.equalsIgnoreCase(name1));
	}

}
