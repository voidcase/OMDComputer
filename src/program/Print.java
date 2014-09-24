package program;

import os.Memory;
import os.Operand;

public class Print extends Command{
	Operand message;
	
	public Print(Operand o){
		message = o;
	}
	
	@Override
	public int execute(Memory m, int pc) {
		// TODO Auto-generated method stub
		System.out.print(message.getWord(m));	//TODO om bara getWord kunde ha en getValue av något slag.
		return pc+1;
	}

	@Override
	protected String nameOf() {
		// TODO Auto-generated method stub
		return "PRT";
	}

	@Override
	protected Operand[] listParams() {
		// TODO Auto-generated method stub
		Operand[] p = new Operand[1];
		p[0] = message;
		return null;
	}
}
