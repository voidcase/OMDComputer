package program;

import os.LongWord;
import os.Memory;
import os.Operand;

public class JumpEq extends SuperJump{
	
	private Operand term1, term2;
	
	public JumpEq(Operand t1, Operand t2,int d){
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
		// TODO Auto-generated method stub
		return "JEQ";
	}

	@Override
	protected Operand[] listParams() {
		// TODO Auto-generated method stub
		Operand[] p = new Operand[3];
		p[0] = term1;
		p[1] = term2;
		p[2] = new LongWord(destination);
		return null;
	}
}
