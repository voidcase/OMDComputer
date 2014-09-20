package os;

public interface Command {
	public abstract void execute(Memory m, ProgramCounter pc);
}
