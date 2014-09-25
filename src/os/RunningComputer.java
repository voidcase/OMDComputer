package os;

import program.Factorial;
import program.Program;

public class RunningComputer {
	
	public static void main(String[] args) {
		Program factorial = new Factorial();
		System.out.println(factorial);
		LongMemory lm = new LongMemory(64);
		Computer comp = new Computer(lm);
		comp.load(factorial);
		comp.run();
	}

}
