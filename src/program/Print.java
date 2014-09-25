package program;

import os.Memory;
import os.Operand;

public class Print extends Command{
	Operand message;
	
	public Print(Operand o){
		message = o;
	}
	
	@Override
	public int execute(Memory m, int pc) {
		System.out.print(message.getWord(m));
		return pc+1;
	}

	@Override
	protected String nameOf() {
		return "PRT";
	}

	@Override
	protected Operand[] listParams() {
		Operand[] p = new Operand[1];
		p[0] = message;
		return p;
	}
}
