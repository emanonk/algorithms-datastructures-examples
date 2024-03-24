package codesignal;
public class MatrixElementsSum {

	private static int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for(int r = 0; r < matrix[0].length; r++) {
			for(int f = 0; f < matrix.length; f++) {

				if(matrix[f][r] == 0) {
					System.out.println("r:"+r+" f:"+f+ "Ghost");
					break;
				}
				System.out.println("r:"+r+" f:"+f+ " v:"+matrix[f][r]);
				sum += matrix[f][r];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int[][] matrix = {
				{0,1,1,2},
				{0,5,0,0},
				{2,0,3,3}};

		int[][] matrix1 = {
				{1, 1, 1, 0},
				{0, 5, 0, 1},
				{2, 1, 3, 10}};
		System.out.println(matrixElementsSum(matrix1));

	}
}