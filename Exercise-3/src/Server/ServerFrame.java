package Server;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.TextArea;
import javax.swing.SwingConstants;
import java.awt.Font;

public class ServerFrame extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel_2 = new JLabel("Connection Status : Waiting for connectoin");
	private TextArea textArea = new TextArea();
	

	public ServerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		textArea.setEditable(false);
		JLabel lblNewLabel = new JLabel("Server");
		lblNewLabel.setBounds(0, 0, 46, 14);
		contentPane.add(lblNewLabel);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		lblNewLabel_2.setBounds(10, 21, 414, 28);
		contentPane.add(lblNewLabel_2);
		textArea.setBounds(10, 55, 414, 346);
		
		contentPane.add(textArea);
	}

	public void setConnectionStatus(String text) {
		lblNewLabel_2.setText("Connection Status : "+text);
	}
	

	
	public void wordCountReceive(String text) {
		textArea.setText("->Words counted : "+text+"\n" + textArea.getText());
		textArea.setText("->Result was sent to the client. \n" + textArea.getText());
		textArea.setEditable(false);
	}
}
