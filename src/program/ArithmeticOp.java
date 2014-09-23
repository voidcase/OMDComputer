package program;

import os.Address;
import os.Memory;
import os.Operand;
import os.Word;

public abstract class ArithmeticOp extends Command {
	protected Operand m1, m2;
	protected Address m3;

	protected abstract String nameOf();
	
	protected Operand[] listParams() {
		Operand[] ops = {m1, m2, m3};
		return ops;
	}
	
	protected abstract Word ArithmaticOp (Operand first, Operand second, Memory m);
	
	public int execute(Memory m, int pc) {
		m.edit(ArithmaticOp(m1.getWord(m), m2.getWord(m), m), m3);
		return pc++;
	}

	public ArithmeticOp (Operand m1, Operand m2, Address m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
}
