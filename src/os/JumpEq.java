package os;

public class JumpEq extends SuperJump{
	
	private Operand term1, term2;
	
	public JumpEq(Operand t1, Operand t2,int d){
		super(d);
		term1 = t1;
		term2 = t2;
	}
	
	@Override
	public int execute(Memory m, int pc) {
		if (term1.getWord(m).equals(term2.getWord(m))){
			return destination;
		}
		else{
			return pc+1;
		}
	}
}
