package program;

import os.LongWord;
import os.Memory;
import os.Operand;

public class Jump extends SuperJump{
	public Jump(int d) {
		super(d);
	}

	public int execute(Memory m, int pc){
		return destination;
	}

	@Override
	protected String nameOf() {
		return "JMP";
	}

	@Override
	protected Operand[] listParams() {
		Operand[] p = new Operand[1];
		p[0] = new LongWord(destination);
		return p;
	}
}
