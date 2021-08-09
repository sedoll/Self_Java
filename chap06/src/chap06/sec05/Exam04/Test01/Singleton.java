package chap06.sec05.Exam04.Test01;
//ÇÏ³ªÀÇ °´Ã¼¸¸ »ý¼º, ½Ì±ÛÅæ
public class Singleton {
	private static Singleton singleton = new Singleton();
	
	static Singleton getInstance() {
		return singleton;
	}
}
