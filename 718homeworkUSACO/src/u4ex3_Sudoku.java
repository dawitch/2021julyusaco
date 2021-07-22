
//Given a Sudoku of size n by n, where n is a square number, check if it is valid.
public class u4ex3_Sudoku {

	public static boolean containsAll(int[] arr) {
		// check the combinations of all
		// Counter example of just using sum and product: 1 4 9 4 5 7 2 4 9
		// check whether an array of 9 integers are 1,2, ..., 9
		boolean[] appeared = new boolean[10];

		for (int i = 0; i < 9; i++) {
			int v = arr[i];
			appeared[v] = true;
		}

		for (int v = 1; v <= 9; v++) {
			if (appeared[v] == false) {
				return false;
			}
		}
		return true;
	}

	// Check whether the rows of a sudoku are valid
	public static boolean checkRows(int[][] sudoku) {
		for (int r = 0; r < 9; r++) {
			if (!containsAll(sudoku[r])) {
				return false;
			}
		}
		return true;
	}

	// Check whether the columns of a sudoku are valid
	public static boolean checkColumns(int[][] sudoku) {
		int[] testArray = new int[9];

		for (int c = 0; c < 9; c++) {
			for (int r = 0; r < 9; r++) {
				testArray[r] = sudoku[r][c];
			}

			if (!containsAll(testArray)) {
				return false;
			}
		}
		return true;
	}

	// Check whether the 9 blocks are valid: each 3x3 block is
	// "flattened" into an array of size 9.
	public static boolean checkBlocks(int[][] sudoku) {
		int[] testArray = new int[9];

		for (int i = 0; i < 9; i += 3) { // (i, j) upper left corner of each block
			for (int j = 0; j < 9; j += 3) {
				int k = 0;
				for (int r = 0; r < 3; r++) { // (r, c) index inside each block
					for (int c = 0; c < 3; c++) {
						testArray[k] = sudoku[i + r][j + c];
						k++;
					}
				}

				if (!containsAll(testArray)) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		int[][] sudoku = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		// display the sudoku
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				System.out.print(sudoku[i][j] + " ");
			}
			System.out.println();
		}

		if (checkRows(sudoku) && checkColumns(sudoku) && checkBlocks(sudoku)) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}
