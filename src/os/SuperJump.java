package os;

public abstract class SuperJump implements Command{
	protected int destination;
	public SuperJump(int d){
		destination = d;
	}
	public abstract void execute(Memory m, ProgramCounter pc);
}
