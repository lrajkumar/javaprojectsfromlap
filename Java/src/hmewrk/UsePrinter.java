package hmewrk;

public class UsePrinter {
	 public static void main(String[] args) {
		 Printer printer1=new Printer();
		 Printer printer2=new Printer();
		 
		 
	    printer1.brand=args[0];
		printer1.price=Integer.parseInt(args[1]);
		 printer1.isColorPrinter=Boolean.parseBoolean(args[2]);
		 
		 printer2.brand=args[3];
	     printer2.price=Integer.parseInt(args[4]);
	     printer2.isColorPrinter=Boolean.parseBoolean(args[5]);
		 
		
		 Printer[] printers= {printer1,printer2};
          for(int i=0;i<printers.length;i++) {
        	  System.out.println(printers[i].brand+" "+printers[i].price+" "+printers[i].isColorPrinter); 
		 }
	 }
}

