package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		// set : 중복 객체 저장 안됨, 순서 유지 안됨
		Set<String> set = new HashSet<String>();
		
		// 객체 저장
		set.add("java");
		set.add("JDBC");
		set.add("servlet/jsp");
		set.add("java");
		
		// 크기
		System.out.println("set 크기 : " + set.size());
		
		// 전체 출력
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String setString = ir.next();
			System.out.println(setString);
		}
		
		// 객체 삭제
		set.remove("java");
		
		
	}
}
