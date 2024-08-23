package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapMain {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("신용권", 85);
		map.put("유재석", 65);
		map.put("이수근", 45);
		map.put("김범수", 75);
		map.put("신용권", 85);
		
		System.out.println(map.get("신용권"));
		System.out.println(map.size());
		
		//객체 모두 출력
		//1.keySet
		Set<String> keyset = map.keySet();
		Iterator<String> ir = keyset.iterator();
		
		while(ir.hasNext()) {
			String key = ir.next();
			int value = map.get(key);
			System.out.println("key : " + key + " value : " + value);
		}
		
		System.out.println("-------------------------------");
		
		//2.entrySet
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eir = entrySet.iterator();
		while(eir.hasNext()) {
			Map.Entry<String, Integer> entry = eir.next();
			String key = entry.getKey();
			int value = entry.getValue();
			System.out.println("key : " + key + " value : " + value);
		}
	}
}
