package Server;

import java.io.*;
import java.net.*;

public class WordCounterServer {

	public static void main (String[] args) throws IOException {
		
		ServerFrame test = new ServerFrame();
		test.setVisible(true);
		
		ServerSocket s = new ServerSocket(9999);
		Socket ss = s.accept();
		
		test.setConnectionStatus("Connect");
		DataInputStream din = new DataInputStream(ss.getInputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DataOutputStream dout = new DataOutputStream(ss.getOutputStream());
		WordCounter wordCounter = new WordCounter();
		int anotherCount = 0;
		while(true) {
			String yoo = din.readUTF();
			
			int count = wordCounter.countWord(yoo);
			
			if(count != anotherCount) {
			test.wordCountReceive(Integer.toString(count));
			anotherCount= count;
			}
			dout.writeUTF(Integer.toString(count));
		}
	
	}
}
