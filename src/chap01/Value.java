package chap01;

public class Value {

	public static void main(String[] args) {
		// 기본타입
		// char : 한글자 작성, 작은따음표
		char charValue = 89;
		System.out.println(charValue);
		int intValue = charValue;
		System.out.println(intValue);
		
		int num1 = 1;
		int num2 = 2;
		double result = (double)num1 / (double)num2;
		System.out.println(result);

		// 기본타입 -> 문자열 -> 기본타입
		System.out.println("==========================");
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("value3 : " + value3);
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		System.out.println("==========================");
		
		String name = "홍길동동주";
		int age = 25;
		double weight = 65.245;
		
		System.out.printf("이름은 %s\n", name);
		System.out.printf("나이는 %d\n", age);
		System.out.printf("안녕은 %f\n", weight);
		
	}

}
