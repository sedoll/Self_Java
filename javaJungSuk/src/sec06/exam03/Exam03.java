package sec06.exam03;

public class Exam03 {
	String name; // 학생이름
	int ban; // 반
	int no; // 번호
	int kor; // 국어점수
	int eng; // 영어점수
	int math; // 수학점수
	
	// 메서드
	public int getTotal() {
		return kor + eng + math;
	}
	
	public float getAverage() {
		return Math.round((getTotal() / 3f) * 100)/100f;
	}
}
