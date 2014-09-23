package os;

public class Mul extends ArithmeticOp {

	public Mul(Operand m1, Operand m2, Address m3) {
		super(m1, m2, m3);
	}

	@Override
	protected Word ArithmaticOp(Operand first, Operand second, Memory m) {
		return first.getWord(m).mul(second.getWord(m));
	}

	@Override
	protected String nameOf() {
		return("MUL");
	}
}
