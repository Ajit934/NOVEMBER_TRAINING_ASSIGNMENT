package com.yash.collection.program;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test_Q_6 {
	
		static Map<String, Integer> map = new HashMap<>();

	
		public static void sortbykey() {
			
			TreeMap<String, Integer> sorted = new TreeMap<>();

		
			sorted.putAll(map);

			// Display the TreeMap which is naturally sorted
			for (Map.Entry<String, Integer> entry : sorted.entrySet())
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
		}

		
		public static void main(String args[]) {
			// putting values in the Map
			map.put("Pune", 5000);
			map.put("Mumbai", 4000);
			map.put("Shegaon", 8000);
			map.put("Nagpur", 3000);
			map.put("Nashik", 9000);

		
			sortbykey();

		}
	}

