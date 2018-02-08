/*import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class HardParser {
	
	private String path;
	private int [][] hardMatrix = new int[8][8]; 
	
	public HardParser(String fileName, int[][] array) {
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
		
		ArrayList<String> labels = new ArrayList<String>(Arrays.asList(
				"forced partial assignment:",
				"forbidden machine:",
				"too-near tasks:"
			));
		
		switch (currentLine) {
			case "forced partial assignment:":
				//parseTuples(line, )
				//readTuple(line, reader, currentLine, 1 , "m,t", "forced");
				parseTuple(line, "m,t", "forced");
				break;
			case "forbidden machine:":
				setForbidden(reader, currentLine, 2, "m,t", "forbidden");
				break;
			case "too-near tasks:":
				setTooNear(reader, currentLine, 3, "t,t", "tooNear");
				break;
		}	
	}
	
	private void parseTuple(String line, String type, String label) {
		// TODO Auto-generated method stub
		line.replaceAll(" ", "");
		//line.replaceAll("/n", "");
		line.replaceAll("(","");
		line.replaceAll(")","");
		line.replaceAll("[","");
		line.replaceAll("]","");
		//line = line.replace("[()]", "");
		String[] values = line.split(",");
		
		ArrayList<String> forced = new ArrayList<String>();
		ArrayList<String> forbidden = new ArrayList<String>();
		ArrayList<String> tooNear = new ArrayList<String>();
		
		if (values.length % 2 != 0) {
			System.out.print("Invalid");
		}else {
		
			switch (label) {
			case "forced":
				for (int counter = 1; counter<values.length; counter++) {
					forced.add(values[counter]);
				};
			case "forbidden":
				for (int counter = 1; counter<values.length; counter++) {
					forbidden.add(values[counter]);
				};
			case "tooNear":
				for (int counter = 1; counter<values.length; counter++) {
					tooNear.add(values[counter]);
				};
		}
		}
		
		
	}

	//private void readTuple(String line, BufferedReader reader, String currentLine, int nextLabel, String type, String label)
	private void readTuple(String line, BufferedReader reader, String currentLine, int nextLabel, String type, String label){
		try {
			reader.mark(1000); //mark reader to return if next label found
			
			if (label == "forced") {
				parseTuple(line, type, label);
			}
			else
		}catch (IOException e){}
	}
		


	private void setForced(BufferedReader reader, String currentLine, String type, String label) {
		// TODO Auto-generated method stub
		
		
	}

	private void setTooNear(BufferedReader reader, String currentLine, String type, String string2) {
		// TODO Auto-generated method stub
		
	}

	private void setForbidden(BufferedReader reader, String currentLine, String type, String label) {
		// TODO Auto-generated method stub
		//readTuples();
		
	}
		
	}

}*/
