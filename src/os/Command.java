package os;

public interface Command {
	public abstract void execute(Memory m, ProgramCounter pc);	//TODO osäker om den ska vara abstract.
}
