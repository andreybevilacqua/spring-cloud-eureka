package demo.domain;

/**
 * 'Word' object is nicely represented in JSON over a regular String.
 */
public class Word {

	private String myWord;

	public Word() {
		super();
	}	
	
	public Word(String word) {
		this();
		this.myWord = word;
	}

	public String getMyWord() {
		return myWord;
	}
	
	public String getString() {
		return getMyWord();
	}

}
