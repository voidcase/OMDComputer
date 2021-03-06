package program;

import os.Address;
import os.Memory;
import os.Operand;
import os.Word;

public class Mul extends ArithmeticOp {

	public Mul(Operand m1, Operand m2, Address m3) {
		super(m1, m2, m3);
	}

	@Override
	protected Word arithmeticStrategy(Operand first, Operand second, Memory m) {
		return first.getWord(m).mul(second.getWord(m));
	}

	@Override
	protected String nameOf() {
		return("MUL");
	}
}
