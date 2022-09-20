package hmewrk;

import java.util.ArrayList;
public class UseCrayon {
	public static void main(String[] args) {
	

		String[] a=args[0].split(",");
		String brand=a[0];
         int price=Integer.parseInt(a[1]);
         int no0fShades=Integer.parseInt(a[2]);
         Crayon crayon1=new Crayon (brand, price,no0fShades);

		String[] b=args[1].split(",");
         String cbrand=b[0];
         int cprice=Integer.parseInt(b[1]);
          int cnoOfShades=Integer.parseInt(b[2]); 
          Crayon crayon2=new Crayon (cbrand,cprice,cnoOfShades);

	ArrayList<Crayon> crayons=new ArrayList<>();
         crayons.add(crayon1);
		crayons.add(crayon2);
		
int aa=0;
		for(int i=0;i<crayons.size(); i++) {
        if (crayons.get(i).getPrice() >50) { 
       
        System.out.println(crayons.get(i).getBrand()+" is greater than 50");
        }
		}
	}
	}

		
		
		
	


