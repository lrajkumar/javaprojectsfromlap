package DAY15;

public class DistrictBank extends StateBank{
  public int loan(int amount,int interest) {
	  return amount-interest;
	
  }
   void show() {
	   super.loan(5000, 500);
   }
  public static void main(String[] args) {
	  DistrictBank d=new DistrictBank();
	  //System.out.println(d.loan(5000,500));
	  d.show();
	  System.out.println(d.loan(5000,500));
  }
}
