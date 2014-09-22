package os;

public interface Word extends Operand {

	@Override
	public Word getWord(Memory memory);
	
	public Word add(Word word);
	
	public Word mul(Word word);
	
	public void setValue(Word word);
	
	public String toString();
}
