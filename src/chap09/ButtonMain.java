package chap09;

public class ButtonMain {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListener(new Call());
		btn.touch();
		
		btn.setOnClickListener(new Message());
		btn.touch();
	}

}
