package os;

public abstract class SuperJump implements Command{
	public abstract void execute(Memory m, ProgramCounter pc);
}
