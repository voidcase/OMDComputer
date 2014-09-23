package program;

import os.Memory;

public class Jump extends SuperJump{
	public Jump(int d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public int execute(Memory m, int pc){
		return destination;
	}
	
	public String toString(){
		return "JMP";
	}
}
