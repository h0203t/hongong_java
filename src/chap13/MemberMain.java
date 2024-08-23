package chap13;

import java.util.HashSet;
import java.util.Set;

public class MemberMain {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30));
		set.add(new Member("강강강", 25));
		
		System.out.println("총 객체 수 : " + set.size());
		
		
	}

}
