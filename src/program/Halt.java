package program;

import os.Memory;
import os.Operand;

public class Halt extends Command{

	@Override
	public int execute(Memory m, int pc) {
		return -1;
	}
	@Override
	protected String nameOf() {
		return "HLT";
	}
	@Override
	protected Operand[] listParams() {
		return new Operand[0];
	}
}
