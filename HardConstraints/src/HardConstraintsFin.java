import java.util.ArrayList;
import java.lang.String;

/*
 * CAN MAKE SMALLER! LOTS OF REPETITION
 */

public class HardConstraintsFin{
	int matrixIndex;
	int globeSize = 8;
	int ignoreVal = -1;
	
	//public void doHard(int[][] array, ArrayList<String> forced, ArrayList<String> forbidden, ArrayList<String> tooNear)
	public int[][] doHard(int[][] array, int[] forced, int[] forbidden, ArrayList<String> tooNearTasks) {
	//public void doHard(){
		//int size = forced.size();
		
		int size = forced.length; //change to global size since all list same size
		
		//if (forced.length>globeSize) {System.out.println("Error: Forced Pairtial Assignment lengs out of bounds!");}
		//if (forbidden.length>globeSize) {System.out.println("Error: Forbidden Machine lengs out of bounds!");}
		//if (tooNearTasks.size()>globeSize) {System.out.println("Error: Too-Near Tasks lengs out of bounds!");}
		
		for (int counter = 0; counter < forced.length; counter++) {
			forcedPartial(array, forced, forced[counter], counter, size);	
		}
		
		for (int counter = 0; counter < forbidden.length; counter++) {
			forbidden(array, forbidden, forbidden[counter], counter, size);
		}
		
		//for (int counter = 0; counter < tooNearTasks.length; counter++) {	
		//	tooNearProcess(array, tooNearTasks, tooNearTasks[counter][], size);
			
		//}
		return array;
	}
	
	private void tooNearProcess(int[][] array, char[] tooNearList, char forbiddenPair, int size) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter < 3; counter ++) {
			//char tooNearIndiv = forbiddenPair.;
			
		}
	}

	private void forbidden(int[][] array, int[] forbiddenList, int task, int machine, int size) {
		// TODO Auto-generated method stub

		//checkTaskBounds(task);
		if (checkTaskBounds(task) == false) {
			System.out.print("Error: Invalid Machine/Task");
			
			//do nothing. go back to for loop
		}else {		
		
			switch (machine) {
			case 0:
				setforbidden(array, 0, task, size);
			case 1:
				setforbidden(array, 1, task, size);
			case 2:
				setforbidden(array, 2, task, size);
			case 3:
				setforbidden(array, 3, task, size);
			case 4:
				setforbidden(array, 4, task, size);
			case 5:
				setforbidden(array, 5, task, size);
			case 6:
				setforbidden(array, 6, task, size);
			case 7:
				setforbidden(array, 7, task, size);
			}
		}
		
	}

	/*
	 * sets forbidden task in matrix to infinity, leaves others untouched 
	 */
	private void setforbidden(int[][] array, int machine, int task, int size) {
		// TODO Auto-generated method stub
		for (int counter = 0; counter<size; counter++) {
			if (counter==task) {
				array[machine][task] = ignoreVal;
			}else {
				continue;//do nothing go back to for loop 
				}
			}
		}

	/*
	 * checks if task in list of hard contraints is in bounds (0 to 7) 
	 */
	private boolean checkTaskBounds(int task) {
		// TODO Auto-generated method stub
		// check if task is with in bounds
		
		boolean isInBound = false;
		
		if ((task < 0) || (task > 7)) {
			isInBound = false;
			//System.out.print("Error: Invalid Machine/Task");
		}else {
			isInBound = true;
		}
		return isInBound;
	}
	
	/*
	 * calls setForced to assign forced partial matches 
	 */

	//private void forcedPartial(ArrayList<String> forced, int forced_index) 
	//private void forcedPartial(String pair)
	private void forcedPartial(int[][] array, int[] forcedList, int task, int machine, int size){ //(task = string, machine number)
		//for (int counter = 0; counter < pair)
		//String forcedIndex0 = pair[1];
		//Set<Integer> doubleAssign = new HashSet<Integer>();
		
		//if ((task < 0) || (task > 7)){System.out.println("Error: Machine Out Of Bounds!");}
		//for (int counter = 0; counter < forcedList.length-1;counter++ ) {
		//	doubleAssign.add(forcedList[counter]);
		//}if 
		
		//checkTaskBounds(task);
		if (checkTaskBounds(task) == false) {
			//do nothing. go back to for loop
		}else {	
		
			switch (machine) {
			case 0:
				setForced(array, 0, task, size);
			case 1:
				setForced(array, 1, task, size);
			case 2:
				setForced(array, 2, task, size);
			case 3:
				setForced(array, 3, task, size);
			case 4:
				setForced(array, 4, task, size);
			case 5:
				setForced(array, 5, task, size);
			case 6:
				setForced(array, 6, task, size);
			case 7:
				setForced(array, 7, task, size);
			}	
		}
		}
	
	/*
	 * sets forced partial matches by infinity-ing cannot pair tasks in machine row
	 * does not touch  
	 */
 
	private void setForced(int[][] array, int machine, int task, int sizeOfMatrix) {
		// TODO Auto-generated method stub
		
		//if ((task < 0) || (task > 8)) {
			//do nothing
		//}
		
		for (int counter = 0; counter < sizeOfMatrix; counter++) {
			if (counter != task) {
				array[machine][counter] = ignoreVal;
			}else {continue;}
			//-1 out all other element in row and keep penalty for forced assign
		}
		
	}

}

