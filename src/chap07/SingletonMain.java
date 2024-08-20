package chap07;

public class SingletonMain {

	public static void main(String[] args) {
		
		//싱글톤 객체 얻기
		Singleton myst = Singleton.getInstance();
		System.out.println(myst.name);
		
	}

}
