package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.awt.event.ActionEvent;

public class MiniCalculator {
	private int ctr;
	private BigDecimal Dinput1, Dinput2;
	private BigInteger input1, input2;
	private static final int MAX_DIGIT = 16;
	private String operation;
	private JFrame frmMiniCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiniCalculator window = new MiniCalculator();
					window.frmMiniCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public MiniCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMiniCalculator = new JFrame();
		frmMiniCalculator.setTitle("Mini Calculator");
		frmMiniCalculator.setBounds(100, 100, 337, 391);
		frmMiniCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMiniCalculator.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		frmMiniCalculator.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		textArea.setBounds(10, 5, 304, 71);
		textArea.setForeground(Color.WHITE);
		textArea.setBackground(Color.GRAY);
		textArea.setFont(new Font("Segoe UI Light", Font.BOLD, 12));
		textArea.setEditable(false);
		panel.add(textArea);
		
		JButton btnNewButton = new JButton("AC");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				ctr = 0;
			}
		});
		btnNewButton.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		btnNewButton.setBounds(1, 87, 79, 52);
		panel.add(btnNewButton);
		
		JButton button = new JButton("+/-");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BigDecimal negated = new BigDecimal(textArea.getText());
				textArea.setText(negated.negate().toString());
			}
		});
		button.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		button.setBounds(1, 299, 79, 52);
		panel.add(button);
		
		JButton button_1 = new JButton("%");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinput1= new BigDecimal(textArea.getText());
				input1= new BigInteger(textArea.getText());
				BigDecimal output = new BigDecimal(0l);
				BigDecimal hundred = new BigDecimal(100l);
				output = Dinput1.divide(hundred);
				textArea.setText(output.toString());
				ctr = 0;
			}
		});
		button_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 16));
		button_1.setBounds(161, 87, 79, 52);
		panel.add(button_1);
		
		JButton button_2 = new JButton("\u00F7");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinput1= new BigDecimal(textArea.getText());
				input1= new BigInteger(textArea.getText());
				textArea.setText("");
				operation = "division";
				ctr = 0;
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_2.setBounds(241, 87, 79, 52);
		button_2.setBackground(new Color(255, 153, 0));
		panel.add(button_2);
		
		JButton button_3 = new JButton("7");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("7");
					ctr++;
				}
			}
		});
		button_3.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_3.setBounds(1, 140, 79, 52);
		panel.add(button_3);
		
		JButton button_4 = new JButton("8");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("8");
					ctr++;
				}
			}
		});
		button_4.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_4.setBounds(81, 140, 79, 52);
		panel.add(button_4);
		
		JButton button_5 = new JButton("9");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("9");
					ctr++;
				}
			}
		});
		button_5.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_5.setBounds(161, 140, 79, 52);
		panel.add(button_5);
		
		JButton btnX = new JButton("\u00D7");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinput1= new BigDecimal(textArea.getText());
				input1= new BigInteger(textArea.getText());
				textArea.setText("");
				operation = "multiplication";
				ctr = 0;
			}
		});
		btnX.setForeground(Color.WHITE);
		btnX.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		btnX.setBounds(241, 140, 79, 52);
		btnX.setBackground(new Color(255, 153, 0));
		panel.add(btnX);
		
		JButton button_7 = new JButton("4");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("4");
					ctr++;
				}
			}
		});
		button_7.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_7.setBounds(1, 193, 79, 52);
		panel.add(button_7);
		
		JButton button_8 = new JButton("5");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("5");
					ctr++;
				}
			}
		});
		button_8.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_8.setBounds(81, 193, 79, 52);
		panel.add(button_8);
		
		JButton button_9 = new JButton("6");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("6");
					ctr++;
				}
			}
		});
		button_9.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_9.setBounds(161, 193, 79, 52);
		panel.add(button_9);
		
		JButton button_10 = new JButton("-");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinput1= new BigDecimal(textArea.getText());
				textArea.setText("");
				operation = "subtraction";
				ctr = 0;
			}
		});
		button_10.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_10.setForeground(Color.WHITE);
		button_10.setBounds(241, 193, 79, 52);
		button_10.setBackground(new Color(255, 153, 0));
		panel.add(button_10);
		
		JButton button_11 = new JButton("1");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("1");
					ctr++;
				}
			}
		});
		button_11.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_11.setBounds(1, 246, 79, 52);
		panel.add(button_11);
		
		JButton button_12 = new JButton("2");
		button_12.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (ctr < MAX_DIGIT) {
					textArea.append("2");
					ctr++;
				}
			}
		});
		button_12.setBounds(81, 246, 79, 52);
		panel.add(button_12);
		
		JButton button_13 = new JButton("3");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("3");
					ctr++;
				}
			}
		});
		button_13.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_13.setBounds(161, 246, 79, 52);
		panel.add(button_13);
		
		JButton button_14 = new JButton("+");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Dinput1= new BigDecimal(textArea.getText());
				textArea.setText("");
				operation = "addition";
				ctr = 0;
			}
		});
		button_14.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_14.setForeground(Color.WHITE);
		button_14.setBounds(241, 246, 79, 52);
		button_14.setBackground(new Color(255, 153, 0));
		panel.add(button_14);
		
		JButton button_15 = new JButton("0");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ctr < MAX_DIGIT) {
					textArea.append("0");
					ctr++;
				}
			}
		});
		button_15.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		button_15.setBounds(81, 299, 79, 52);
		panel.add(button_15);
		
		JButton button_16 = new JButton(".");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textArea.getText().contains(".")) {
					textArea.append(".");
				}
			}
		});
		button_16.setFont(new Font("Segoe UI Light", Font.BOLD, 20));
		button_16.setBounds(161, 299, 79, 52);
		panel.add(button_16);
		
		JButton btnAc = new JButton("=");
		btnAc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BigDecimal output = new BigDecimal(0l);
				Dinput2= new BigDecimal(textArea.getText());
				if (operation == "addition") {
					output = Dinput1.add(Dinput2);
				} else if (operation == "subtraction") {
					output = Dinput1.subtract(Dinput2);
				} else if (operation == "division") {
					output = Dinput1.divide(Dinput2, 10, BigDecimal.ROUND_HALF_UP);
				} else if (operation == "multiplication") {
					output = Dinput1.multiply(Dinput2);
				}
				textArea.setText(output.toString());
				operation = "";
				ctr = 0;
			}
		});
		btnAc.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		btnAc.setForeground(Color.WHITE);
		btnAc.setBounds(241, 299, 79, 52);
		btnAc.setBackground(new Color(255, 153, 0));
		panel.add(btnAc);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Document doc = textArea.getDocument();
				try {
					doc.remove(doc.getLength() - 1, 1);
				} catch (BadLocationException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					if (ctr > 0) {
						ctr--;
					}
				}
			}
		});
		btnC.setFont(new Font("Segoe UI Light", Font.BOLD, 16));
		btnC.setBounds(81, 87, 79, 52);
		panel.add(btnC);
	}
}
