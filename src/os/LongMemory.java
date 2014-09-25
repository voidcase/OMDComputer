package os;

public class LongMemory extends Memory {
	
	
	public LongMemory(int size) {
		super(size);
		wordList = new LongWord[size];
		for (int i = 0; i < size; i++) {
			long number = 0;
			LongWord lw = new LongWord(number);
			wordList[i] = lw;
		}
	}

}
