package chap08;

public class HankookTire implements Tire{

	@Override
	public void roll() {
		System.out.println("한국타이어가 굴러갑니다.");
	}
	
	
	public void print() {
		System.out.println("한국에서 가장 좋은 타이어 입니다.");
	}

}
