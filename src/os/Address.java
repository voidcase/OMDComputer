package os;

public class Address {
	
	private int index;
	//ska address ha word?
	private Word word;
	
	public Address(int index) {
		this.index = index;
	}
	
	public Word getWord(Memory memory) {
		//TODO: Implement
		//memory.vad?
		return null;
	}
	
	public int getIndex() {
		return index;
	}

}
