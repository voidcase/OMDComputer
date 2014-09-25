package program;

import java.util.ArrayList;

public abstract class Program extends ArrayList<Command>{
	
	
	public Program(){
		super();
	}
	
	public boolean add(Command command){
		return super.add(command);
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(Command c: this){
			sb.append(i + "\t" + c.toString() + "\n");
			i++;
		}
		return sb.toString();
	}
}
