package program;

import os.Address;
import os.Memory;
import os.Operand;
import os.Word;

public abstract class ArithmeticOp extends Command {
	protected Operand m1, m2;
	protected Address m3;
	
	public ArithmeticOp(Operand m1, Operand m2, Address m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	protected abstract Word arithmeticStrategy(Operand first, Operand second, Memory m);

	protected abstract String nameOf();
	
	protected Operand[] listParams() {
		Operand[] ops = {m1, m2, (Operand) m3};
		return ops;
	}
	
	public int execute(Memory m, int pc) {
		m.edit(arithmeticStrategy(m1.getWord(m), m2.getWord(m), m), m3);
		return pc + 1;
	}
}
