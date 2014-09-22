package os;

public class LongWord implements Word {
	
	private long number;
	
	public LongWord(long number) {
		this.number = number;
	}
	
	public long getValue() {
		return number;
	}
	
	public Word getWord(Memory memory) {
		return this;
	}
	
	@Override
	public Word add(Word word) {
		LongWord lw = (LongWord) word;
		long value = lw.getValue();
		long result = number + value;
		LongWord newLW = new LongWord(result);
		return newLW;
	}

	@Override
	public Word mul(Word word) {
		LongWord lw = (LongWord) word;
		long value = lw.getValue();
		long result = number * value;
		LongWord newLW = new LongWord(result);
		return newLW;
	}

	public void setValue(Word word) {
		LongWord lw = (LongWord) word;
		number = lw.getValue();
	}
	
	public String toString() {
		String string = String.valueOf(number);
		return string;
	}
}