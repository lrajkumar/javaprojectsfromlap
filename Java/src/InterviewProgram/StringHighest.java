package InterviewProgram;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StringHighest {
	public static void main(String[] args) {
		String inputString = "bbblghbfbby";

		char[] inputCharArray = inputString.toCharArray();

		Map<Character, Integer> characterByCountMap = new HashMap<>();

		for (int i = 0; i < inputCharArray.length; i++) {
			char currentChar = inputCharArray[i];
			
			Integer count = characterByCountMap.get(currentChar);
			if(count == null) {
				characterByCountMap.put(currentChar, 1);
			} else {
				characterByCountMap.put(currentChar, ++count);
			}
		}
		
		
		characterByCountMap.entrySet().stream()
			.max(Comparator.comparing(Map.Entry::getValue))
			.ifPresent(entry -> System.out.println("Highest character is " + entry.getKey() + " with count " + entry.getValue())); 
			//print(characterByCountMap);

	}
	
	private static void print(Map<Character, Integer> characterByCountMap) {
		System.out.println(characterByCountMap);
	}

}
