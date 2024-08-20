package chap08;

public class SmartTv implements RemoteControl, Searchable{
	
	//필드
	private int volume;
	//생성자
	
	//메소드

	@Override
	public void turnOn() {
		System.out.println("스마트Tv 켬");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트Tv 끔");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 SmartTV 볼륨 : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		System.out.println(url + " 검색합니다.");
	}

}
