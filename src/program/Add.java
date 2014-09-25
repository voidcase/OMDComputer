package program;

import os.Address;
import os.Memory;
import os.Operand;
import os.Word;

public class Add extends ArithmeticOp{

	public Add(Operand m1, Operand m2, Address m3) {
		super(m1, m2, m3);
	}

	@Override
	protected String nameOf() {		//ska inte detta vara en toString?
		return("ADD");
	}

	@Override
	protected Word arithmeticStrategy(Operand first, Operand second, Memory m) {
		return first.getWord(m).add(second.getWord(m));
	}

}
