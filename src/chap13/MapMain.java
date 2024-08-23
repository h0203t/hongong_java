package chap13;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
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
		
		//hashTable
//		Map<String, String> map3 = new Hashtable<>();
//		
//		map3.put("Spring", "12");
//		map3.put("summer", "123");
//		map3.put("fall", "1234");
//		map3.put("winter", "12345");
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		while(true) {
//			System.out.println("아이디와 비밀번호를 입력해주세요.");
//			System.out.print("아이디 : ");
//			String id = scanner.nextLine();
//			
//			System.out.print("비밀번호 : ");
//			String password = scanner.nextLine();
//		
//			System.out.println();
//		
//			if(map3.containsKey(id)) {
//				if(map3.get(id).equals(password)) {
//					System.out.println("로그인 되었습니다.");
//					break;
//				} else {
//					System.out.println("비밀번호가 일치하지 않습니다.");
//				}
//			} else {
//				System.out.println("입력하신 아이디가 존재하지 않습니다.");
//			}
//		}
		
		
		Map<String, Integer> map4 = new HashMap<>();
		map4.put("blue", 10);
		map4.put("hong", 20);
		map4.put("white", 30);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keyset4 = map4.keySet();
		Iterator<String> ir4 = keyset4.iterator();
		
		while(ir4.hasNext()) {

			String key = ir4.next();
			int value = map4.get(key);
			totalScore += value;
			if(maxScore < value) {
				maxScore = value;
				name = key;
			}
			
		}
		System.out.println("평균점수: " + totalScore / map4.size());
		System.out.println("최고점수: " + maxScore);
		System.out.println("최고점수를 받은 아이디 : " + name);
	}
}
