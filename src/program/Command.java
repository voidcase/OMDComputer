package program;

import os.Memory;
import os.Operand;

public abstract class Command {
	public abstract int execute(Memory m, int pc);

	protected String nameOf();

	protected Operand[] listParams();

	public String toString() {
		StringBuilder tempS = new StringBuilder();
		tempS.append(nameOf());
		for (Operand o: listParams()) {
			tempS.append("\t");
			tempS.append(o.toString());
		}
		return tempS.toString();
	}
}
