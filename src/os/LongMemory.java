package os;

public class LongMemory extends Memory {
	
	
	public LongMemory(int size) {
		super(size);
		wordList = new LongWord[size];
	}

}
