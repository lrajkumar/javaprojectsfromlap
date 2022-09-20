package DAY15;

public class Summer {
   public String range(int temp) {
	   if(temp>35) {
		   return "Too hot";
	   }
	   else if(temp>=35 && temp<=30) {
		   return "medium";
		   
	   }
	   else if(temp>=29 && temp<=27) {
		   return "low";
	   }
	   else {
		   return "rain";
	   }
	   
   }
}
