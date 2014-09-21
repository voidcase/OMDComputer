package os;

public class ProgramCounter {
	
	private int pos;
	
	public ProgramCounter(){
		pos = 0;
	}
	public void jumpTo(int d){
		pos = d;
	}
	public int toInt(){
		return pos;
	}
	
}
