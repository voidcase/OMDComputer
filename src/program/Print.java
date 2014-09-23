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
	public String toString(){
		return "PRT";
	}
}
