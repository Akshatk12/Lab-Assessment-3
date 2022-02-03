package Q1;

import java.util.*;

/* Q1. consider Map and data as given below:

Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");
		

1. print map using stream
2. print only that records that contain key contains raj
3. print map sorted by key
4. print map sorted by values
5. print map reverse sorted by the key
 */
public class Q1_1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("raj", 95);
		map.put("ekta", 75);
		map.put("rajiv", 85);
		map.put("sunita", 66);
		map.put("gunika", 99);
		System.out.println("------printing map------");

		// Print map using stream

		System.out.println("------Map Using Stream------");
		map.entrySet().stream()
				.forEach(record -> System.out.println("Name: " + record.getKey() + ", Marks: " + record.getValue()));

		// Print only that records that contain key contains raj

		System.out.println("------Records that contain key as raj------");
		map.entrySet().stream().filter(entry -> (entry.getKey()).equals("raj"))
				.forEach(record -> System.out.println("Name: " + record.getKey() + ", Marks: " + record.getValue()));

		// Print map sorted by key

		System.out.println("------Map sorted by key------");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.forEach(record -> System.out.println("Name: " + record.getKey() + ", Marks: " + record.getValue()));

		// Print map sorted by values

		System.out.println("------Map sorted by values------");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.forEach(record -> System.out.println("Name: " + record.getKey() + ", Marks: " + record.getValue()));

		// Print map reverse sorted by the key

		System.out.println("------Map sorted by key in reverse order------");
		map.entrySet().stream().sorted((a, b) -> b.getKey().compareTo(a.getKey()))
				.forEach(record -> System.out.println("Name: " + record.getKey() + ", Marks: " + record.getValue()));
	}
}
