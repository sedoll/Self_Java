package chap09.sec01.test.exam05;

public class Example {

	public static void main(String[] args) {
		CheckBox cb = new CheckBox();
		cb.setOnSelectListener(new BackgroundChangeListener());
		cb.select();
		

	}

}
