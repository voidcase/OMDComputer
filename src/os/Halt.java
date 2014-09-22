package os;

public class Halt implements Command{

	@Override
	public int execute(Memory m, int pc) {
		return -1;
	}

}