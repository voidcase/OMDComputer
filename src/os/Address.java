package os;

public class Address implements Operand {
	
	private int index;
	
	public Address(int index) {
		this.index = index;
	}
	
	public Word getWord(Memory memory) {
		return memory.getWord(index);
	}
	
	public int getIndex() {
		return index;
	}
	
	public String toString() {
		return "[" + index + "]";
	}
}
