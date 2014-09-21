public abstract class ArithmeticOp implements Command {
	protected Operand m1, m2;
	protected Address m3;

	protected LongWord implementation (Operand first, Operand second) {
		return null;	
	}
	
	public void execute(Memory m, ProgramCounter pc) {
		m.edit(implementation(m1.getWord(m), m2.getWord(m)), m3);
	}

	public ArithmeticOp (Operand m1, Operand m2, Address m3) {
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
}
