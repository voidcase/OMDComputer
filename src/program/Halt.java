package program;

import os.Memory;

public class Halt extends Command{

	@Override
	public int execute(Memory m, int pc) {
		return -1;
	}
	public String toString(){
		return "HLT";
	}
}