package dynamic_beat_3;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

// JFrame은 자바에서 GUI 기반의 프로그램을 만들 때 사용
public class DynamicBeat extends JFrame{
	//필드
	//전체 화면에 대한 이미지를 담는 인스턴스
	private Image screenImage;
	private Graphics screenGraphic;
	
	private Image introBackground;
	
	// 생성자
	public DynamicBeat() {
		setTitle("Dynamic Beat"); // 타이틀 제목
		setSize(Main.SCREEN_WIDTH, Main.SCRENN_HEIGHT);
		setResizable(false); // 사용자가 창 크기를 임의로 조절하는걸 방지
		setLocationRelativeTo(null); // 창이 중앙에 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 종료시 프로그램 전체 종료, 이게 없으면 게임을 꺼도 컴퓨터 내에서 계속 실행
		setVisible(true); // 정상적일 경우 게임창 보이기
		
		introBackground = new ImageIcon(Main.class.getResource("../images/background1.jpg")).getImage();
		
		Music introMusic = new Music("intromusic.mp3", true);
		introMusic.start();
	}
	
	//메소드
	public void paint(Graphics g) {
		screenImage = createImage(Main.SCREEN_WIDTH,Main.SCRENN_HEIGHT);
		screenGraphic = screenImage.getGraphics();
		screenDraw(screenGraphic);
		g.drawImage(screenImage, 0, 0, null);
	}
	
	public void screenDraw(Graphics g) {
		g.drawImage(introBackground, 0, 0, null);
		this.repaint();
	}
}
