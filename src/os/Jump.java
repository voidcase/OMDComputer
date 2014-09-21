package os;

public class Jump extends SuperJump{
	public Jump(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void execute(Memory m, ProgramCounter pc){
		pc.jumpTo(destination);
	}
}
