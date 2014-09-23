package os;

public class Copy implements Command{

	Operand source;
	Address destination;
	
	public Copy(Operand o, Address a){
		source = o;
		destination = a;
	}
	
	@Override
	public int execute(Memory m, int pc) {
		Word w = source.getWord(m);
		m.edit(w, destination);
		return pc+1;
	}
	public String toString(){
		return "CPY";
	}
}
