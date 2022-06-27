package chap09.sec01.exam06;

public class Example {

	public static void main(String[] args) {
		Button bt = new Button();
		CallListener cl = new CallListener();
		MessageListener ml = new MessageListener();
		bt.OnClickListener(cl);
		bt.touch();
		cl.onClick();
		
		bt.OnClickListener(ml);
		bt.touch();
		ml.onClick();
	}

}
