package Presentation;

import java.util.regex.Pattern;

public class Reg {
	public static void main(String args[]){    
		System.out.println(Pattern.matches(".r.", "arp")); // This statement displays Boolean value True because the second character is r in both string and regular exp.     
		System.out.println(Pattern.matches(".bm", "abc")); //This statement displays Boolean value False because the third character is different in both string and regular exp.       
		System.out.println(Pattern.matches("..m", "msm")); //This statement displays Boolean value True because the third character is m in both string and regular exp.       
		System.out.println(Pattern.matches("a..s", "amns")); //This statement displays Boolean value True because the first and last character is same in both string and regular exp.      
		System.out.println(Pattern.matches(".s.", "mas")); //This statement displays Boolean value False because the second character is different in both string and regular exp.       
		}  
		}  
	


