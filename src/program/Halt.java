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
		// TODO Auto-generated method stub
		return "HLT";
	}
	@Override
	protected Operand[] listParams() {
		// TODO Auto-generated method stub
		return new Operand[0];
		}
	}
