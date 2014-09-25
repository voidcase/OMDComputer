package program;

import os.Address;
import os.Memory;
import os.Operand;
import os.Word;

public class Copy extends Command{

	private Operand source;
	private Address destination;
	
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
	
	@Override
	protected String nameOf() {
		return "CPY";
	}

	@Override
	protected Operand[] listParams() {
		Operand[] p = {source, (Operand) destination};
		return p;
	}
}
