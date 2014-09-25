package program;

import os.LongWord;
import os.Memory;
import os.Operand;

public class JumpEq extends SuperJump{
	
	private Operand term1, term2;
	
	public JumpEq(int d, Operand t1, Operand t2){
		super(d);
		term1 = t1;
		term2 = t2;
	}
	
	@Override
	public int execute(Memory m, int pc) {
		if (term1.getWord(m).equals(term2.getWord(m))){
			return destination;
		}
		else{
			return pc+1;
		}
	}

	@Override
	protected String nameOf() {
		return "JEQ";
	}

	@Override
	protected Operand[] listParams() {
		Operand[] p = new Operand[3];
		p[0] = new LongWord(destination);
		p[1] = term1;
		p[2] = term2;
		return p;
	}
}
