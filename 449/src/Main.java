import java.io.FileNotFoundException;
import java.util.ArrayList;

//package assignment1;

public class Main {

	public static void main(String[] args) {
		String inputFileName = "minimalisticexample.txt";
		String outputFileName = "";
		int[][] penaltyMatrix = new int[8][8];
		int[] forcedPartialAssignment = new int[8];
		int[] forbiddenMachine = new int[8];
		ArrayList<String> tooNearTasks = new ArrayList<String>();
		
		try {
			inputFileName = args[0];
			outputFileName = args[1];
		} 
		catch(Exception e) {
			System.out.println("ERROR: retry with valid argument parameters INPUTFILE OUPUTFILE");
			System.exit(0);
		}
		
		FileParser setup = new FileParser();
		setup.openAndParse(penaltyMatrix, forcedPartialAssignment, forbiddenMachine, tooNearTasks, inputFileName);
		HardConstraints hardCon = new HardConstraints();
		penaltyMatrix = hardCon.doHard(penaltyMatrix, forcedPartialAssignment, forbiddenMachine, tooNearTasks);
		System.out.println("done");
			
	}
}