package calculator2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator2 {

	private JFrame frame;
	private JTextField textField;
	private JButton btn4;
	
	private String s = "";
	private String cal;
	private double a;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator2 window = new Calculator2();
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
	public Calculator2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\uACC4\uC0B0\uAE30");
		frame.setBounds(100, 100, 317, 481);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 30));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 10, 277, 64);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn1.getText();
				textField.setText(s);
			}
		});
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn1.setBounds(12, 294, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn2.getText();
				textField.setText(s);
			}
		});
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn2.setBounds(84, 294, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn3.getText();
				textField.setText(s);
			}
		});
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn3.setBounds(156, 294, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				s = "";
				cal = btnPlus.getText();
				textField.setText(s);
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnPlus.setBounds(228, 294, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn0.getText();
				textField.setText(s);
			}
		});
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn0.setBounds(84, 364, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btnDot.getText();
				textField.setText(s);
			}
		});
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnDot.setBounds(156, 364, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				    switch(cal) {
				    	case "+":
				    		a += Double.parseDouble(textField.getText());
				    		break;
				    	case "-":
				    		a -= Double.parseDouble(textField.getText());
				    		break;
				    	case "*":
				    		a *= Double.parseDouble(textField.getText());
				    		break;
				    	case "/":
				    		a /= Double.parseDouble(textField.getText());
				    		break;
				    	case "%":
				    		a %= Double.parseDouble(textField.getText());
				    		break;
				    }
				}catch (Exception NullPointException){
					s = "";
					a = 0;
				}finally{
					s = String.format("%.2f", a);
					textField.setText(""+s);
					s = "";
					a = 0;
				} 
			}
		});
		btnEqual.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnEqual.setBounds(228, 364, 60, 60);
		frame.getContentPane().add(btnEqual);
		
		JButton btnTran = new JButton("\u00B1");
		btnTran.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""+(-Double.parseDouble(textField.getText())));
			}
		});
		btnTran.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnTran.setBounds(12, 364, 60, 60);
		frame.getContentPane().add(btnTran);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn4.getText();
				textField.setText(s);
			}
		});
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn4.setBounds(12, 224, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn5.getText();
				textField.setText(s);
			}
		});
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn5.setBounds(84, 224, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn6.getText();
				textField.setText(s);
			}
		});
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn6.setBounds(156, 224, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				s = "";
				cal = btnSub.getText();
				textField.setText(s);
			}
		});
		btnSub.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnSub.setBounds(228, 224, 60, 60);
		frame.getContentPane().add(btnSub);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn7.getText();
				textField.setText(s);
			}
		});
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn7.setBounds(12, 154, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn8.getText();
				textField.setText(s);
			}
		});
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn8.setBounds(84, 154, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s += btn9.getText();
				textField.setText(s);
			}
		});
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btn9.setBounds(156, 154, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMum = new JButton("*");
		btnMum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				s = "";
				cal = btnMum.getText();
				textField.setText(s);
			}
		});
		btnMum.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnMum.setBounds(228, 154, 60, 60);
		frame.getContentPane().add(btnMum);
		
		JButton btnP = new JButton("%");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				s = "";
				cal = btnP.getText();
				textField.setText(s);
			}
		});
		btnP.setFont(new Font("±¼¸²", Font.BOLD, 25));
		btnP.setBounds(12, 84, 60, 60);
		frame.getContentPane().add(btnP);
		
		JButton btnBackSpace = new JButton("<");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length() > 0) {
					StringBuilder strB = new StringBuilder(textField.getText());
					strB.deleteCharAt(textField.getText().length()-1); // ¸Ç µÚÀÇ ¼ýÀÚ Á¦°Å
					backSpace = strB.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackSpace.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnBackSpace.setBounds(84, 84, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnCE = new JButton("D");
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				s = "";
				a = 0;
				textField.setText(s);
			}
		});
		btnCE.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnCE.setBounds(156, 84, 60, 60);
		frame.getContentPane().add(btnCE);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Double.parseDouble(textField.getText());
				s = "";
				cal = btnDiv.getText();
				textField.setText(s);
			}
		});
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 30));
		btnDiv.setBounds(228, 84, 60, 60);
		frame.getContentPane().add(btnDiv);
	}
}
