package Presentation;


import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegularExpression {
    public static void main(String[] args) {
    	/*String re="\\D";             // "\\D";                //"\\d\\d\\d";                //"\\s";                 //"\\w";                    //"\\w\\w";
    	String text="r";              //"g";                // "665";                   //"y";                // "*";                 //"Ss";
    	
		  Pattern pt=Pattern.compile(re);
		  Matcher mt=pt.matcher(text);
		  boolean result=mt.matches();
		  System.out.println(result); */
		  
		
		 /* String rev="^a...";   
		  String text1="akjd";
		  Pattern p=Pattern.compile(rev);
		  Matcher m=p.matcher(text1);
		  boolean result1=m.matches();
		  System.out.println(result1); */
		  
		  /*String rev1="...r$";   //shows the last letter must end with r
		  String text2="ar";
		  Pattern p1=Pattern.compile(rev1);
		  Matcher m1=p1.matcher(text2);
		  boolean result2=m1.matches();
		  System.out.println(result2);*/
		  
		
		 /* String rev2="b.r";   //shows the last letter must end with r
		  String text3="bar";
		  Pattern p2=Pattern.compile(rev2);
		  Matcher m2=p2.matcher(text3);
		  boolean result3=m2.matches();
		  System.out.println(result3);  */
		  
    	 String rev3="b.r";   //shows the last letter must end with r
		  String text4="bar";
		  Pattern p3=Pattern.compile(rev3);
		  Matcher m3=p3.matcher(text4);
		  boolean result4=m3.matches();
		  System.out.println(result4);
		  
		  
		  
		  
		  
		  
		  
	}
}
