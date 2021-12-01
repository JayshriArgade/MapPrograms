package Map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args)
	{
		TreeMap map = new TreeMap();
		
		map.put(3,"Aman");
		map.put(4,"Sarthak");
		map.put(1,"Ram");
		map.put(2,"Sham");
		map.put(5,"Ramesh");
		map.put(6,"jay");
		
		System.out.println(map);
		
		System.out.println("Ceiling key method = "+map.ceilingKey(1));
		
		System.out.println("Contains key method = "+map.containsKey(8));
		System.out.println("Contains value method = "+map.containsValue("Ram"));
		
		System.out.println("First key method = "+map.firstKey());
		
		System.out.println("Higher key method = "+map.higherKey(4));
		System.out.println("Lower key method = "+map.lowerKey(6));
		
		System.out.println("Size method = "+map.size());
		
	}

}
