package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textField;
	
	double firstNum;
	double secondNum;
	double result;
	String operations;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 467);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("±¼¸²", Font.PLAIN, 18));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(12, 10, 236, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn7.setBounds(12, 127, 50, 50);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn8.setBounds(74, 127, 50, 50);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		 btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +  btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn9.setBounds(136, 127, 50, 50);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn4.setBounds(12, 187, 50, 50);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn5.setBounds(74, 187, 50, 50);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn6.setBounds(136, 187, 50, 50);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn1.setBounds(12, 247, 50, 50);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn2.setBounds(74, 247, 50, 50);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn3.setBounds(136, 247, 50, 50);
		frame.getContentPane().add(btn3);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPlus.setBounds(198, 67, 50, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnSub.setBounds(198, 127, 50, 50);
		frame.getContentPane().add(btnSub);
		
		JButton btnMin = new JButton("x");
		btnMin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMin.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnMin.setBounds(198, 187, 50, 50);
		frame.getContentPane().add(btnMin);
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnDiv.setBounds(198, 247, 50, 50);
		frame.getContentPane().add(btnDiv);
		
		JButton btn0 = new JButton("0");
		 btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() +  btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btn0.setBounds(12, 307, 50, 50);
		frame.getContentPane().add(btn0);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(textField.getText());
				switch(operations) {
				case "+":
					result = firstNum + secondNum;
					answer = String.format("%.2f", result);
					break;
				case "-":
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					break;
				case "*":
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					break;
				case "/":
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					break;
				case "%":
					result = firstNum % secondNum;
					answer = String.format("%.2f", result);
					break;
				}
				textField.setText(answer);
			}
		});
		btnEqual.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnEqual.setBounds(198, 307, 50, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btnDot.getText();
				textField.setText(EnterNumber);
			}
		});
		btnDot.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnDot.setBounds(74, 307, 50, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btnPS = new JButton("\u00B1");
		btnPS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(textField.getText());
				ops = ops * -1;
				textField.setText(String.valueOf(ops));
			}
		});
		btnPS.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnPS.setBounds(136, 307, 50, 50);
		frame.getContentPane().add(btnPS);
		
		JButton btnReset = new JButton("C");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = "";
				textField.setText(EnterNumber);
			}
		});
		btnReset.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnReset.setBounds(12, 67, 50, 50);
		frame.getContentPane().add(btnReset);
		
		JButton btnMove = new JButton("<");
		btnMove.addActionListener(new ActionListener() {
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
		btnMove.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnMove.setBounds(74, 67, 50, 50);
		frame.getContentPane().add(btnMove);
		
		JButton btnRest = new JButton("%");
		btnRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnRest.setFont(new Font("±¼¸²", Font.BOLD, 18));
		btnRest.setBounds(136, 67, 50, 50);
		frame.getContentPane().add(btnRest);
	}
}
