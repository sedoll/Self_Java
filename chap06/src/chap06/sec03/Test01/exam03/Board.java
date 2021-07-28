package chap06.sec03.Test01.exam03;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitCount;
	
	Board(String title, String content) {
		this(title, content, "∫¿¡ÿ»£", "2021-07-29", 100);
	}
	
	Board(String title, String content, String writer) {
		this(title, content, writer, "2021-07-29", 100);
	}
	
	Board(String title, String content, String writer, String date) {
		this(title, content, writer, date, 100);
	}
	
	Board(String title, String content, String writer, String date, int hitCount) {
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
		this.hitCount = hitCount;
	}

}
