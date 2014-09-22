package os;

public class Add extends ArithmeticOp{

	public Add(Operand m1, Operand m2, Address m3) {
		super(m1, m2, m3);
	}

	@Override
	protected String nameOf() {
		return("ADD");
	}

	@Override
	protected Word ArithmaticOp(Operand first, Operand second, Memory m) {
		return first.getWord(m).add(second.getWord(m));
	}

}
