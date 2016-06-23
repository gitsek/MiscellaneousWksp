package workoutPkg;

// TODO
public class SpiralMatrixDisplay {
	static int[][] spiralMatrix = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
	
	static void displaySpiralMatrix() {
		/* Display the data in the below order bases on a 5 x 5 matrix
		 * 1. Row 0 | Column 4 | Row 4 | Column 0
		 * 2. Row 1 | Column 3 | Row 3 | Column 1
		 * 3. Row 2 
		 */
		int rowstart = 0;
		int colEnd = 4;
		int colStart = 0;
		int rowEnd = 4;
		
		for(int i = 0; i <= (spiralMatrix[0].length >> 1); i++ ) {
			for(int col=0; col < spiralMatrix[0].length; col++) {
				System.out.print(" " + spiralMatrix[i][col]);
			}
		}
	}

	public static void main(String[] args) {
		SpiralMatrixDisplay.displaySpiralMatrix();
	}
}
