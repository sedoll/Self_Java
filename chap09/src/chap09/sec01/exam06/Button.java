package chap09.sec01.exam06;

public class Button {
	OnClickListener listener;
	
	void OnClickListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	// 중첩 인터페이스
	static interface OnClickListener {
		void onClick();
	}
}
