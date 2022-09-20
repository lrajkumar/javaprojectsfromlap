package Day6;

public class UseWatch {
	 public static void main(String[] args) {
		 Watch w1=new Watch();
		 Watch w2=new Watch();
		 Watch w3=new Watch();
		 String a=args[0];
		 String[] b=a.split(",");
		 w1.brand=b[0];
		 w1.color=b[1];
		 w1.isDigital=Boolean.parseBoolean(b[2]);
		 w1.price=Integer.parseInt(b[3]);
		 w1.discount=Integer.parseInt(b[4]);
		 w1.netPrice=w1.price-w1.discount;
		 
		 String c=args[1];
		 String[] d=c.split(",");
		 w2.brand=d[0];
		 w2.color=d[1];
		 w2.isDigital=Boolean.parseBoolean(d[2]);
		 w2.price=Integer.parseInt(d[3]);
		 w2.discount=Integer.parseInt(d[4]);
		 w2.netPrice=w2.price-w2.discount;
		 
		 String e=args[2];
		 String[] f=e.split(",");
		 w3.brand=f[0];
		 w3.color=f[1];
		 w3.isDigital=Boolean.parseBoolean(f[2]);
		 w3.price=Integer.parseInt(f[3]);
		 w3.discount=Integer.parseInt(f[4]);
		 w3.netPrice=w3.price-w3.discount;
		 
		 if(w1.price>w2.price && w1.price>w3.price) {
			 System.out.println("watch1 is higher");
		 }
		 else if(w2.price>w1.price && w2.price>w3.price){
			 System.out.println("Watch2 is higher");
		 }
		 else {
			 System.out.println("watch3 is higher");
		 }
		 
		if (w1.brand.equals(w2.brand)) {
			System.out.println("watch1 and watch2 are same");
		}
		
		else if(w2.brand.equals(w3.brand)) {
			System.out.println("watch2 and watch3 are same");
		}
		
		else if(w3.brand.equals(w1.brand)) {
			System.out.println("watch3 and watch2 are same");
		}
		
		else {
			System.out.println("watch3 & watch1 & watch2 are not same");
		}
		if(w1.brand.length()>w2.brand.length() && w1.brand.length()>w3.brand.length()) {
			System.out.println("w1 brand length is higher");
		}
		else if(w2.brand.length()>w3.brand.length() && w2.brand.length()>w3.brand.length()) {
			System.out.println("w2 brand length is higher");
		}
		else {
			System.out.println("w3 brand length is higher");
		}
		
		 }
		 
		 
	 }


