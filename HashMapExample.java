package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) 
	{
		Map map = new HashMap();
		
		map.put(1, "sita");
		map.put(2, "ram");
		map.put("gita", 3);
		map.put(null, 23);
		
		System.out.println(map);
		
		System.out.println("Contains Key method = "+map.containsKey(2));
		System.out.println("Contains Value method = "+map.containsValue(3));
		
		Set set = map.keySet();
		
		System.out.println(set);
		
		for(Object obj : set)
		{
			System.out.println(obj+" > "+map.get(obj));
		}
		
		//Important 
		Set set1 = map.entrySet();
		Iterator itr = set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println(entry.getValue());
		}
		
		map.remove(2);
		System.out.println(map);
	}

}
