package mp3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Canvas;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.UIManager;

public class MP3 {

	private JFrame frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MP3 window = new MP3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MP3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNext = new JButton("\u2192");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNext.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnNext.setBounds(362, 103, 60, 60);
		frame.getContentPane().add(btnNext);
		
		JButton btnPre = new JButton("\u2190");
		btnPre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPre.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPre.setBounds(12, 103, 60, 60);
		frame.getContentPane().add(btnPre);
		
		JButton btnPlay = new JButton("\u25B6");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlay.setBounds(191, 278, 60, 60);
		frame.getContentPane().add(btnPlay);
		
		JButton btnPlay_1 = new JButton("\u25A0");
		btnPlay_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlay_1.setBounds(282, 278, 60, 60);
		frame.getContentPane().add(btnPlay_1);
		
		JButton btnPlay_1_1 = new JButton("S");
		btnPlay_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay_1_1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlay_1_1.setBounds(92, 278, 60, 60);
		frame.getContentPane().add(btnPlay_1_1);
		
		JButton btnPlay_1_2 = new JButton("\u25B2");
		btnPlay_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay_1_2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlay_1_2.setBounds(362, 278, 60, 60);
		frame.getContentPane().add(btnPlay_1_2);
		
		JButton btnPlay_1_3 = new JButton("\u25BC");
		btnPlay_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlay_1_3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlay_1_3.setBounds(12, 278, 60, 60);
		frame.getContentPane().add(btnPlay_1_3);
		
		JLabel pictureBox = new JLabel("");
		pictureBox.setBackground(UIManager.getColor("Button.darkShadow"));
		pictureBox.setBounds(92, 10, 250, 250);
		frame.getContentPane().add(pictureBox);
	}
}
