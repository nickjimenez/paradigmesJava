/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class HardConstrains {
	
	private String path;
	private int [][] hardMatrix = new int[8][8]; 
	
	public HardConstrains(String fileName, int[][] array) {
		this.path = fileName;
		this.hardMatrix = array;
	}
	
	void parseFile() throws IOException{
		FileReader fr = new FileReader(path);
		BufferedReader reader = new BufferedReader(fr);
		String line;
		while ((line = reader.readLine()) != "machine penalties:") {
			checkInput(line,reader);
		}
	}
	
	private void checkInput(String line, BufferedReader reader) {
		String currentLine = line.toLowerCase(); //for consistency
		currentLine = currentLine.trim();
		
		switch (currentLine) {
			case "forced partial assignment:":
				parseTuples(line, )
				setForced(reader, currentLine);
				break;
			case "forbidden machine:":
				setForbidden(reader, currentLine);
				break;
			case "too-near tasks:":
				setTooNear(reader,currentLine);
				break;
		}	
	}

	private void setTooNear(BufferedReader reader, String currentLine) {
		
		
	}

	private void setForbidden(BufferedReader reader, String currentLine) {
		
		
	}

	private void setForced(BufferedReader reader, String currentLine) {
		// TODO Auto-generated method stub
		
	}
/*	
	public void hardConstraints(int[][] array, int[][] forced) {
		//ArrayList<int[]> forcedPairs = new ArrayList<int[]>(); 		//Contains pairs that must be made
		int[] hard_result = new int[forced.length];
		//int[][] forcedPair = new int[][2];
		
		//for (int counter = 0; counter <= (array.length-1); counter++) {
		//	for (int counter1 = 0; counter1 <= (array.length-1); counter1++) {
		//		hard_result[counter][counter1] = array[counter][counter1];
		//	}
		//}
		for (int counter = 0; counter <= (forced.length-1); counter++) {
				switch (forced[counter][0]){
				case 0:
					hardResult(0, forced[counter][1]);
				case 1:;
				switch (forced[counter][1]) {
				case 0:;
				case 1:;
				case 2:;
				case 3:;
				}
				case 2:;
				switch (forced[counter][1]) {
				case 0:;
				case 1:;
				case 2:;
				case 3:;
				}
				case 3:;
				switch (forced[counter][1]) {
				case 0:;
				case 1:;
				case 2:;
				case 3:;
				}
			}
		}
	}

	private void hardResult(int index0, int index1) {
		int size = 8;
		int[][] hardMatrix = new int[size][size];
		
		for (int counter = 0; counter <= size; counter++) {
			for (int counter1 = 0; counter1 <= size; counter1++) {
				hardMatrix[counter][counter1] = -1;
			}
		}
		
		switch (index1) {
		case 0:
			hardMatrix[index0][0] = array[][0];
		case 1:
			hardMatrix[index0][1] = 1;
		case 2:
			hardMatrix[index0][2] = 1;
		case 3:
			hardMatrix[index0][3] = 1;
		case 4:
			hardMatrix[index0][4] = 1;
		case 5:
			hardMatrix[index0][5] = 1;
		case 6:
			hardMatrix[index0][6] = 1;
		case 7:
			hardMatrix[index0][7] = 1;
		}		
	}

	public static void hardAssign(int index0, int index1) {
		for (int counter = 1 ; counter <= ) )
		
		switch (forced[index0][1]) {
		case 0:
			hard_result[0] = 0;
		case 1:
			hard_result[0] = 1;
		case 2:
			hard_result[0] = 2;;
		case 3:
			hard_result[0] = 3;;
		}
		
	}
	
	public static void main(String[] args) {
		String [][] init_matrix = new String[4][4];
		/*init_matrix = {{"1","2","3","4"},
					   {"5","4","2","3"},
					   {"6","2","3","7"},
					   {"3","5","1","4"}};
		for (int counter = 0; counter < 4; counter++) {
			
		}
		int[][] forced = [[1,0,0,0],[0,0,1,0],[0,1,0,0],[0,0,0,1]];
		int[][] forced = [[1,0,0,0],[0,0,1,0],[0,1,0,0],[0,0,0,1]]		
		/*
		String line = null;
		String file = args[0];
		
		try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            while((line = bufferedReader.readLine()) != null & line !=  "machine penalties:") {
            	
            		if (line == "forced partial assignment:") {
            			line = line.replace(" ", "");
            			line = line.replace("(", "");
            			line = line.replace(")", "");
            			line = line.replace("\n", "");
            		}
            }	
            bufferedReader.close();
            
            
        }
        catch (Exception e) {
    		System.out.println("Error while parsing input file");
    		System.exit(0);
    		}
    		
	}
	/*
	public void forced() {}
	public void forbidden() {}
	public void too_near() {}
	


}*/
