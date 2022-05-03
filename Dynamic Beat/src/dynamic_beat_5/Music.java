package dynamic_beat_5;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

import javazoom.jl.player.Player;

public class Music extends Thread {
	
	//필드
	private Player player; // 자바 소리 라이브러리
	private boolean isLoop; // 무한반복 or 한번 재생
	private File file;
	private FileInputStream fis;
	private BufferedInputStream bis;
	
	//생성자
	public Music(String name, boolean isLoop) {
		// 예외처리
		try {
			this.isLoop = isLoop;
			file = new File(Main.class.getResource("../music/" + name).toURI());
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			player = new Player(bis);
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	// 메소드
	public int getTime() { // 음악이 어떤 위치에서 실행하는지 알려주는 메소드
		if(player == null)
			return 0;
		return player.getPosition();
	}
	
	public void close() { // 리듬게임을 하다가 음악을 다른걸로 바꾸고 싶을 때
		isLoop = false;
		player.close();
		this.interrupt();
	}
	
	@Override
	public void run() {
		try { 
			do { // isLoop 가 true 이면 해당 곡을 무한으로 반복
				player.play();
				fis = new FileInputStream(file);
				bis = new BufferedInputStream(fis);
				player = new Player(bis);
			} while(isLoop);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
