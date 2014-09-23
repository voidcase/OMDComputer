package Program;

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
		
		for(Command c: this){
			sb.append(c.toString() + "\n");
		}
		
		return sb.toString();
		
	}
	

}
