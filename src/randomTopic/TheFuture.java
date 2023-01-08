package randomTopic;

import java.util.HashMap;

public class TheFuture {

	public static void main(String[] args) {
	
		HashMap<String, Integer> names = new HashMap<>();
		names.put("Atyab", 1);
		names.put("Fatima", 2);
		names.put("Saeed", 3);
		names.put("Abdullah", 4);
		names.put("Malak", 5);
		names.put("Fatima", 6);
		names.put("Daniyal", 7);
		names.put("atyab", 8);
		names.put("Abdullah", 9);
		names.put("Abdullah", 10);
		
		
		
		
		
		
		
		for(String key: names.keySet()) {
			if(names.get(key)>1) {
				 System.out.println("Names '" + key + "' occurs " + names.get(key) + " times.");
			}
		}
	}

}
