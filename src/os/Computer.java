package os;

import Program.Command;
import Program.Program;

public class Computer {
	private Memory memory;
	private Program program;
	private int programCounter;

	public Computer(Memory memory) {
		this.memory = memory;
		programCounter = -1;
	}

	public void load(Program program) {
		this.program = program;
		programCounter = 0;
	}

	public void run() {
		if (program == null) {
			System.out.println("Program is empty"); // Bara en check
		}

		while (programCounter >= 0) {
			programCounter = program.get(programCounter).execute(memory);
		}

	}
}
