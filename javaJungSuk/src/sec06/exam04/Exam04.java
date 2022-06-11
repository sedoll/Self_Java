package sec06.exam04;

public class Exam04 {
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	//생성자
	public Exam04(String n, int b, int no, int k, int e, int m) {
		name = n;
		ban = b;
		this.no = no;
		kor = k;
		eng = e;
		math = m;
	}
	
	// 메서드
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round((getTotal() / 3f) * 100)/100f;
	}
	
	public String info() {
		return name +"," + ban +"," + no +"," + kor +"," + eng +"," + math;
	}
}
