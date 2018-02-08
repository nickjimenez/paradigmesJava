
public class main {

	//int[][] mainArray = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mainArray = {{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0},{0,0,0,0,0,0,0,0}};
		int[] forced = {10,1,0,10,10,10,10,10};
		int[] forbidden = {1,10,10,10,10,10,10,10};
		int[] tooNear = {};
		
		
		System.out.print(mainArray);
		System.out.print("\n");
		
		
		HardConstraintsFin matrix = new HardConstraintsFin();
		//matrix.doHard(mainArray, forced, forbidden, tooNear);
		
		System.out.print(mainArray);

	}

}
