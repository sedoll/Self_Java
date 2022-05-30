package sec01.test.exam05;

public class Child extends Parent{
	private String name;
	
	public Child() {
		// 이 자리에 super()가 생략되어 있어서 부모클래스를 호출한다.
		this("홍길동");
		System.out.println("Child() Call");
		this.run();
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
	
	void run() {
		this.run("일지매");
		System.out.println("run() call");
	}
	
	void run(String s) {
		System.out.println("run(String s) call");
	}

}
