package os;

public class Copy implements Command{

	Operand source;
	Address destination;
	
	public Copy(Operand o, Address a){
		source = o;
		destination = a;
	}
	
	@Override
	public void execute(Memory m, ProgramCounter pc) {
		Word w = source.getWord(m);
		m.edit(w, destination);
	}
}
