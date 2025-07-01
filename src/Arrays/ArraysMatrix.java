package Arrays;

public class ArraysMatrix {
	public static void main(String[] args) {
		int[][] m1 = { { 1, 2, 0 }, { 2, 3, 4 } };
		int[][] m2 = { { 3, 2, 5 }, { 6, 4, 3 } };
		int[][] m3 = { { 1, 1, 1, 1 }, { 3, 2, 3, 1 }, { 2, 2, 2, 2 } };
		int[][] m4 = { { 2, 2, 3, 3 }, { 2, 3, 1, 0 }, { 1, 2, 3, 4 } };
		printMatrixSum(m1, m2);
		System.out.println();
		printMatrixSum(m3, m4);
	}

	private static void printMatrixSum(int[][] m1, int[][] m2) {
		int output = 0;

		for (int a = 0; a < m1.length; a++) {		
			for (int i = 0; i < m1[0].length; i++) {
				output = m1[a][i] + m2[a][i];
				System.out.print(output + " ");
			}
			System.out.println();
		}

	}
}
