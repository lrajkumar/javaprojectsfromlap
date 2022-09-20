package DAY17Collections;

import java.util.ArrayList;

import DAY13.Cars;

public class UseCar {
	public static void main(String[] args) {
		Car c=new Car("Audi","A5",400000);
		Car c1=new Car("BMW","B6",500000);
		Car c2=new Car("ROLLS ROYCE","R18",600000);
		Car c3=new Car("MARUTHI SUZUKI","BALENO",800000);
		Car c4=new Car("HYUNDAI","I20",900000);
		Car c5=new Car("COOPER","C15",700000);
		Car c6=new Car("VOLSWAGEN","v18",1500000);
		Car c7=new Car("MERCEDES BENZ","M5",1800000);
		Car c8=new Car("JAGUVAR","J6",1900000);
		Car c9=new Car("TOYOTA","ETIOS",1600000);
		Car c10=new Car("KIA","CLIMBER",1800000);
		
		ArrayList<Car> li=new ArrayList<>();
		li.add(c);
		li.add(c1);
		li.add(c2);
		li.add(c3);
		li.add(c4);
		li.add(c5);
		li.add(c6);
		li.add(c7);
		li.add(c8);
		li.add(c9);
		li.add(c10);
		
		/*for(int i=0;i<li.size();i++) {
			System.out.println(li.get(i));
			
		}
		for(Car i:li) {
			System.out.println(i);
		}
		
		li.forEach(Temp->System.out.println(Temp));*/
         
		for(int i=0;i<li.size();i++) {
			
			if(li.get(i).getPrice()>150000) {
				System.out.println(li.get(i));
				}
		}
		
			for(Car i:li) {
				if(i.getPrice()>150000) {
					System.out.println(i);
				}
					}
				
			li.forEach((temp)->{if(temp.getPrice()>1500000) {
				System.out.println(temp);
			}
			});
			
			ArrayList<Car> cheap=new ArrayList<>();
			li.forEach((temp)->{if (temp.getPrice()<1000000) cheap.add(temp);});
				
			
			for(Car i:cheap) {
				if(i.getPrice()<10000) {
					cheap.add(i);
				}
			}
			
			
			
			
			
			
	}
			}
		


