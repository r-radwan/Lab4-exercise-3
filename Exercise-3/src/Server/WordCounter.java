package Server;

public class WordCounter {

	public int countWord(String text) {
		
		if(text.isBlank()) {
			return 0;
		}
		int counter = 0;
		for(int index = 0;index<text.length() -1 ;index++) {
			if(text.charAt(index) == ' ' && text.charAt(index +1) != ' ') {
				counter += 1;
			}
		}
		return counter + 1;
		
	}
}
