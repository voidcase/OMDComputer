package os;

public abstract class Memory {

	protected Word[] wordList;

	public Memory(int size) {
	
	}

	public void edit(Word w, Address a) {
		System.out.println(wordList[a.getIndex()]);

		wordList[a.getIndex()].setValue(w);
	}

	public Word getWord(int index){
		return wordList[index];
	}
}
