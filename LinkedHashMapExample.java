package Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args)
	{
		LinkedHashMap map = new LinkedHashMap();
		
		map.put(1,"Ram");
		map.put(2,"Sham");
		map.put(3,"Aman");
		map.put(4,"Sarthak");
		map.put(5,"Ramesh");
		map.put(6,"jay");
		
		System.out.println(map);
		
		System.out.println("Get Key method = "+map.get(3));
		
		System.out.println("Contains value method = "+map.containsValue("Sarthak"));
		System.out.println("Contains Key method = "+map.containsKey(4));
		
		System.out.println("Is Empty method = "+map.isEmpty());
		
		map.putIfAbsent(7, "map");
		System.out.println(map);
		
		System.out.println("Remove method = "+map.remove(map));
		
		System.out.println("Replace method = "+map.replace(7,"map", "Prem"));
		System.out.println(map);
		
		System.out.println("Key Set method = "+map.keySet());
	}

}
