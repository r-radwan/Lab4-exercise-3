package Client;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

@SuppressWarnings("serial")
public class ClientFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel_3 = new JLabel("");
	private boolean keyPressed = false;
	
	public ClientFrame() {
		this.setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 163);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Client");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("This is a simple program to calculate the number of words in a text.");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(10, 0, 414, 62);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Insert Text : ");
		lblNewLabel_2.setBounds(20, 65, 92, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				keyPressed = true;
			}
		});
	
		textField.setBounds(113, 62, 276, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		lblNewLabel_3.setBounds(123, 94, 95, 14);
		contentPane.add(lblNewLabel_3);
	}
	
	public String getText() {
		System.out.print(1);
		return textField.getText();
		
	}
	
	public void setText(String text) {
		System.out.print(2);
		lblNewLabel_3.setText(text +" words");
	}
	
	public boolean getButton() {
		System.out.print(3);
		return keyPressed;
	}
	public void setButton() {
		System.out.print(4);
		keyPressed = false;
	}
}
