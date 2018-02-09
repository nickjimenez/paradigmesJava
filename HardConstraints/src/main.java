import java.util.ArrayList;

public class main {

	//int[][] mainArray = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mainArray = 	    {
		        {9, 2, 7, 8},
		        {6, 4, 3, 7},
		        {5, 8, 1, 8},
		        {7, 6, 9, 4}
		    };
		int[] forced = {0,1,-1,-1,-1,-1,-1,7};
		int[] forbidden = {7,-1,-1,-1,-1,-1,-1,0};
		ArrayList<String> tooNearTasks = new ArrayList<String>();
		
		//int val;
		for (int counter = 0; counter<mainArray.length;counter++) {
			for(int counter1 = 0; counter1<mainArray[counter].length;counter++) {
				int val = mainArray[counter][counter1];
				System.out.print(val);
			}
			//System.out.print(val);
		}
		//System.out.print(mainArray);
		//System.out.print("\n");
		
		
		//HardConstraintsFin matrix = new HardConstraintsFin();
		//matrix.doHard(mainArray, forced, forbidden, tooNear);
		
		//System.out.print(mainArray);

	}

}
