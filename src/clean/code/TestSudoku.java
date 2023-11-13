package clean.code;

public class TestSudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sudoku sudoku = new Sudoku();

		sudoku.setInput("  53     \n" + "8      2 \n" + " 7  1 5  \n" + "4    53  \n" + " 1  7   6\n" + "  32   8 \n"
				+ " 6 5    9\n" + "  4    3 \n" + "     97  ");
		sudoku.findSimpleSolution();

		System.out.println(sudoku.getResult());

		sudoku.setInput("2  5  8 3\n" + "  6      \n" + "51   2 49\n" + "46    9 5\n" + "   1 3   \n" + " 21     7\n"
				+ " 3 4   62\n" + "   3  5  \n" + "6 7  8  4");

		sudoku.findSimpleSolution();

		System.out.println(sudoku.getResult());
		System.out.println(sudoku.getSolution());

		System.out.println("Hola");
	}

}
