package program;

import os.LongWord;
import os.Memory;
import os.Operand;

public class Jump extends SuperJump{
	public Jump(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public int execute(Memory m, int pc){
		return destination;
	}

	@Override
	protected String nameOf() {
		// TODO Auto-generated method stub
		return "JMP";
	}

	@Override
	protected Operand[] listParams() {
		// TODO Auto-generated method stub
		Operand[] p = new Operand[1];
		p[0] = new LongWord(destination);
		return p; //TODO: WAT
	}
}
