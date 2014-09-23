package program;

import os.Memory;

public abstract class SuperJump extends Command{
	protected int destination;
	public SuperJump(int d){
		destination = d;
	}
	public abstract int execute(Memory m, int pc);
}
