package DAY12;

public class Data1 {
	public int netPrice(int price,int discount) {
	int	netPrice=price-(price*discount/100);
		return netPrice;
	}

}
