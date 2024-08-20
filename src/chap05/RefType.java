package chap05;

public class RefType {

	public static void main(String[] args) {
		//참조 타입
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		String str4 = new String("강길동");
		String str5 = null;
		
		if(str1 == str2) {
			System.out.println("같은 객체 참조");
		} else {
			System.out.println("같은 객체 X");
		}
		
		if(str1.equals(str4)) System.out.println("문자열이 같다.");
		else System.out.println("문자열이 다르다.");
	}

}