package DAY15;

public class ScientificCalculator extends Calculator {
	public void divmult() {
		int a=100;
	int b=10;
		System.out.println("Division:"+(a/b));
		System.out.println("Multiply:"+(a*b));
		
	}
  public static void main(String[] args) {
	  
	  ScientificCalculator sc=new ScientificCalculator();
	  sc.addsub();
	  sc.divmult();
  }
}
