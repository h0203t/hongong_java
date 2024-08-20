package chap06;

public class BoardMain {

	public static void main(String[] args) {
		
		Board bd1 = new Board("스폰지밥", "징징이");
		Board bd2 = new Board("아따맘마", "동동이", "아리");
		Board bd3 = new Board("원피스", "루피", "조로", "2022-01-01");
		Board bd4 = new Board("빵빵이", "메롱시티", "스폰지밥", "2023-05-10", 123);
		
		Board[] boards = {bd1, bd2, bd3, bd4, new Board("제목생성", "내용생성")};
		
		
		System.out.println("배열에 저장된 객체 출력 =========");
		for(int i=0; i<boards.length; i++) {
			System.out.printf("%s : %s : %s : %s : %d\n",
					boards[i].title, boards[i].content, boards[i].writer, boards[i].date, boards[i].hitcount);
		}
	}

}
