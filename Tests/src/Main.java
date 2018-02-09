//import java.io.*;
import java.util.ArrayList; 

public class Main {
	static int ignoreVal = -1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mainArray = 	    {
		        {9, 2, 7, 8, 9, 2, 7, 8},
		        {6, 4, 3, 7, 9, 2, 7, 8},
		        {5, 8, 1, 8, 9, 2, 7, 8},
		        {7, 6, 9, 4, 9, 2, 7, 8},
		        {9, 2, 7, 8, 9, 2, 7, 8},
		        {6, 4, 3, 7, 9, 2, 7, 8},
		        {5, 8, 1, 8, 9, 2, 7, 8},
		        {7, 6, 9, 4, 9, 2, 7, 8}
		    };
		int[] forced = {-1, -1, 5, -1, -1, -1, -1, 7};
		int[] forbidden = {-1, -1, -1, -1, -1, -1, -1, -1};
		ArrayList<String> tooNear = new ArrayList();
		
		tooNear.add("HA");
		tooNear.add("BD");
		
		for(int counter = 0; counter<mainArray.length; counter++) {
			for(int counter1 = 0; counter1<mainArray[counter].length; counter1++) {
				System.out.println(mainArray[counter][counter1]);
			}
			System.out.println("\n");
		}
		System.out.println("_________________");
		
		for (int counter = 0; counter < forced.length; counter++) {
			forcedPartial(mainArray, forced, forced[counter], counter);	
		}
		
		for (int counter = 0; counter < forbidden.length; counter++) {
			forbidden(mainArray, forbidden, forbidden[counter], counter);
			}
		
		for(int counter = 0; counter<mainArray.length; counter++) {
			for(int counter1 = 0; counter1<mainArray[counter].length; counter1++) {
				System.out.println(mainArray[counter][counter1]);
			}
			System.out.println("\n");
		}
		System.out.println("_________________");
		
		tooNearRead(mainArray, tooNear, forced);
		
		for(int counter = 0; counter<mainArray.length; counter++) {
			for(int counter1 = 0; counter1<mainArray[counter].length; counter1++) {
				System.out.println(mainArray[counter][counter1]);
			}
			System.out.println("\n");
		}
	}
private static void tooNearRead(int[][] mainArray, ArrayList<String> tooNearArray, int[] forcedList) {
		// TODO Auto-generated method stub
		String tooNearStringPair;
		for (int count = 0; count < tooNearArray.size(); count++) {
			tooNearStringPair = tooNearArray.get(count);
			tooNearComp(mainArray, tooNearStringPair, tooNearArray, forcedList);
		}
	
	
		
	}
private static void tooNearComp(int[][] mainArray, String tooNearStringPair, ArrayList<String> tooNearArray, int[] forcedList) {
	// TODO Auto-generated method stub
	String tooNearString = tooNearStringPair;
	//for (int count = 0; count < tooNearString.length(); count++) {
	
	switch(tooNearString.charAt(0)) {
	case 'A':
		tooNearComp2(mainArray, 0, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'B':
		tooNearComp2(mainArray, 1, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'C':
		tooNearComp2(mainArray, 2, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'D':
		tooNearComp2(mainArray, 3, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'E':
		tooNearComp2(mainArray, 4, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'F':
		tooNearComp2(mainArray, 5, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'G':
		tooNearComp2(mainArray, 6, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	case 'H':
		tooNearComp2(mainArray, 7, tooNearString.charAt(1), tooNearArray, forcedList);
		break;
	}
}
private static void tooNearComp2(int[][] mainArray, int firstTask, char secondTask, ArrayList<String> tooNearArray, int[] forcedList) {
	// TODO Auto-generated method stub
	switch(secondTask) {
	case 'A':
		setTooNear(mainArray, firstTask, 0, tooNearArray, forcedList);
		break;
	case 'B':
		setTooNear(mainArray, firstTask, 1, tooNearArray, forcedList);
		break;
	case 'C':
		setTooNear(mainArray, firstTask, 2, tooNearArray, forcedList);
		break;
	case 'D':
		setTooNear(mainArray, firstTask, 3, tooNearArray, forcedList);
		break;
	case 'E':
		setTooNear(mainArray, firstTask, 4, tooNearArray, forcedList);
		break;
	case 'F':
		setTooNear(mainArray, firstTask, 5, tooNearArray, forcedList);
		break;
	case 'G':
		setTooNear(mainArray, firstTask, 6, tooNearArray, forcedList);
		break;
	case 'H':
		setTooNear(mainArray, firstTask, 7, tooNearArray, forcedList);
		break;
	}
	
}
private static void setTooNear(int[][] mainArray, int firstTask, int secondTask, ArrayList<String> tooNearArray, int[] forcedList) {
	// TODO Auto-generated method stub
    for (int count = 0 ; count < 8; count++) {
//    		if (count == 7) {
//  			if ((mainArray[count][firstTask] != -1)&&(mainArray[0][secondTask] != -1)) {
//    				mainArray[0][secondTask] = -1;
//    			}
//   		}
    		//if ((mainArray[count][firstTask] != -1)&&(mainArray[count+1][secondTask] != -1)) {
    		//	mainArray[count+1][secondTask] = -1;
    		//}
    		if(mainArray[count][firstTask] != -1){
    			//for(int count1 = 0; count1 < 8; count1++) {
    			//	if(mainArray[count][count1] == -1) {
    			if (count == 7) {
    				if (isForced(count,firstTask,forcedList)) {
    					mainArray[0][secondTask] = -1;
    				}
    			}else {
    				if (isForced(count,firstTask, forcedList)) {
    					mainArray[count+1][secondTask] = -1;
    				}		
    			}
    		//for(int count1 = 0; count1< 8; count1++) {
    		//	if (mainArray[count][count1] == -1) {
    				//do not do anything
    		//		continue;
    		//	}else if (mainArray[count][count1] == firstTask) {
    				
    		//	}
    		}
    }
}
	
private static boolean isForced(int machine, int task, int[] forcedList) {
	// TODO Auto-generated method stub
	if (forcedList[machine]==task) {return true;}
	else {return false;}
}

private static void forbidden(int[][] mainArray, int[] forbidden, int forbiddenTask, int machine) {
	// TODO Auto-generated method stub
	if (checkTaskBounds(forbiddenTask) == false) {
		//do nothing. go back to for loop
		System.out.println("ERROR: Task out of bounds");
		System.exit(0);
		
	}
	if (forbiddenTask == -1) {
		//do nothing go back to loop
		setNoChange(mainArray, machine);
	}
	else {	
	
		switch (machine) {
		case 0:
			setForbidden(mainArray, 0, forbiddenTask);
			break;
		case 1:
			setForbidden(mainArray, 1, forbiddenTask);
			break;
		case 2:
			setForbidden(mainArray, 2, forbiddenTask);
			break;
		case 3:
			setForbidden(mainArray, 3, forbiddenTask);
			break;
		case 4:
			setForbidden(mainArray, 4, forbiddenTask);
			break;
		case 5:
			setForbidden(mainArray, 5, forbiddenTask);
			break;
		case 6:
			setForbidden(mainArray, 6, forbiddenTask);
			break;
		case 7:
			setForbidden(mainArray, 7, forbiddenTask);
			break;
		}	
	}
}
		
	private static void setForbidden(int[][] mainArray, int machine, int forbiddenTask) {
	// TODO Auto-generated method stub
		int ignoreVal = -1;
		for (int counter = 0; counter < mainArray.length; counter++) {
			if (counter == forbiddenTask) {
				//mainArray[machine][counter]=mainArray[machine][counter];
				if (mainArray[machine][counter] != ignoreVal) {
					//System.out.println("ERROR: FORCED and FORBIDDEN HARD CONSTRAINTS CONFLICT");
					//System.exit(0);
				}else {
					mainArray[machine][counter] = ignoreVal;
				}
			}else {
				//mainArray[machine][counter] = ignoreVal;
				mainArray[machine][counter]=mainArray[machine][counter];
			}
			//-1 out all other element in row and keep penalty for forced assign
		}
}

	

	private static void forcedPartial(int[][] mainArray, int[] forcedList, int task, int machine) {
		// TODO Auto-generated method stub
		if (checkTaskBounds(task) == false) {
			//do nothing. go back to for loop
			
		}
		if (task == -1) {
			//do nothing go back to loop
			setNoChange(mainArray, machine);
		}
		else {	
		
			switch (machine) {
			case 0:
				setForced(mainArray, 0, task);
				break;
			case 1:
				setForced(mainArray, 1, task);
				break;
			case 2:
				setForced(mainArray, 2, task);
				break;
			case 3:
				setForced(mainArray, 3, task);
				break;
			case 4:
				setForced(mainArray, 4, task);
				break;
			case 5:
				setForced(mainArray, 5, task);
				break;
			case 6:
				setForced(mainArray, 6, task);
				break;
			case 7:
				setForced(mainArray, 7, task);
				break;
			}	
		}
	}
	
	private static void setNoChange(int[][] mainArray, int machine) {
		// TODO Auto-generated method stub
		for(int counter = 0; counter < mainArray.length; counter++) {
			mainArray[machine][counter]= mainArray[machine][counter];
		}
		
	}

	private static void setForced(int[][] mainArray, int machine, int task) {
		int ignoreVal = -1;
		
		for (int counter = 0; counter < mainArray.length; counter++) {
			if (counter != machine) {
				mainArray[counter][task] = ignoreVal;
			}if (counter == task) {
				mainArray[machine][counter]=mainArray[machine][counter];
			}else {
				mainArray[machine][counter] = ignoreVal;
			}
		}
	}

	private static boolean checkTaskBounds(int task) {
		// TODO Auto-generated method stub
		boolean isInBound;
		
		if ((task < 0) || (task > 7)) {
			isInBound = false;
			//System.out.print("Error: Invalid Machine/Task");
			//System.exit(0);
		}if (task == -1){
			isInBound = true;
		}else {
			isInBound = true;
		}
		return isInBound;
	}

}
