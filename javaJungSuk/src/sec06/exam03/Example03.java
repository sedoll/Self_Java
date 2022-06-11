package sec06.exam03;

public class Example03 {

	public static void main(String[] args) {
		Exam03 s = new Exam03();
		s.name = "ȫ�浿";
		s.ban = 1;
		s.no = 1;
		s.kor = 100;
		s.eng = 60;
		s.eng = 76;
		
		System.out.println(s.name);
		System.out.println(s.getTotal());
		System.out.println(s.getAverage());

	}

}
