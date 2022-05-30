package sec09.exam04;

public class Day {
	//필드
	private int year = 1; // 년
	private int month = 1; // 월
	private int date = 1; // 일
	
	//생성자
	public Day() {};
	public Day(int year) {
		this.year = year;
	};
	public Day(int year, int month) {
		this(year);
		this.month = month;
	}
	public Day(int year, int month, int date) {
		this(year, month);
		this.date = date;
	}
	public Day(Day d) {
		this(d.year, d.month, d.date);
	}
	
	//메소드
	//연, 월, 일 불러오기
	public int getYear() {
		return year;
	}
	public int getMonth() {
		return month;
	}
	public int getDate() {
		return date;
	}
	
	//연, 월, 일 설정
	public void setDate(int date) {
		this.date = date;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void set(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
	// 요일 찾기
	public int dayOfWeek() {
		int y = year;
		int m = month;
		if (m==1 || m==2) {
			y--;
			m+=12;
		}
		return (y+y/4-y/100+y/400+(13*m+8)/5+date)%7;
	}
	
}
