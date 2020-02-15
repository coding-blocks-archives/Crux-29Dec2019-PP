package L12_Feb15;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 * @date 15-Feb-2020
 *
 */

public class Backtracking {

	public static void main(String[] args) {

		// QueenCombinationBoxRespect(new boolean[4], 0, 2, 0, "");
		// coinChange(new int[] { 2, 3, 5, 6 }, 0, 10, "");
		QueenCombinationBoxRespect2D(new boolean[2][3], 0, 0, 2, 0, "");
	}

	public static void QueenCombinationBoxRespect(boolean[] board, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board.length) {
			return;
		}

		// place
		board[col] = true;
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf + 1, ans + " b" + col);
		board[col] = false;

		// not place
		QueenCombinationBoxRespect(board, col + 1, tq, qpsf, ans);
	}

	public static void coinChange(int[] denom, int idx, int amount, String ans) {

		if (amount == 0) {
			System.out.println(ans);
			return;
		}

		if (idx == denom.length || amount < 0) {
			return;
		}

		// exclude
		coinChange(denom, idx + 1, amount, ans);
		// include
		coinChange(denom, idx, amount - denom[idx], ans + denom[idx]);

	}

	public static void QueenCombinationBoxRespect2D(boolean[][] board, int row, int col, int tq, int qpsf, String ans) {

		if (qpsf == tq) {
			System.out.println(ans);
			return;
		}

		if (col == board[0].length) {
			row++;
			col = 0;
		}

		if (row == board.length) {
			return;
		}

		// place
		board[row][col] = true;
		QueenCombinationBoxRespect2D(board, row, col + 1, tq, qpsf + 1, ans + "[" + row + "-" + col + "]");
		board[row][col] = false;

		// not place
		QueenCombinationBoxRespect2D(board, row, col + 1, tq, qpsf, ans);
	}

}
