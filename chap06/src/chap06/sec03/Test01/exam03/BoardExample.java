package chap06.sec03.Test01.exam03;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board("영화", "기생충");
		Board board2 = new Board("영화", "기생충", "봉준호");
		Board board3 = new Board("영화", "기생충", "봉준호", "2021-07-29");
		Board board4 = new Board("영화", "기생충", "봉준호", "2021-07-29", 100);
		
		System.out.printf("장르: %s \n제목: %s \n감독: %s \n날짜: %s \n점수: %d \n\n",board1.title, board1.content, board1.writer, board1.date, board1.hitCount);
		System.out.printf("장르: %s \n제목: %s \n감독: %s \n날짜: %s \n점수: %d \n\n",board2.title, board2.content, board2.writer, board2.date, board2.hitCount);
		System.out.printf("장르: %s \n제목: %s \n감독: %s \n날짜: %s \n점수: %d \n\n",board3.title, board3.content, board3.writer, board3.date, board3.hitCount);
		System.out.printf("장르: %s \n제목: %s \n감독: %s \n날짜: %s \n점수: %d \n\n",board4.title, board4.content, board4.writer, board4.date, board4.hitCount);
	}

}
