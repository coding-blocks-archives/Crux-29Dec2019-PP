package Assingment.Feb5;

public class BookAllocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nob = 4;
		int nos = 2;
		int[] books = { 12, 34, 67, 90 };

		int lo = books[nob - 1];
		int hi = 0;

		for (int b : books) {
			hi += b;
		}

		int ans = 0;

		while (lo <= hi) {

			int mid = (lo + hi) / 2;

			if (isItPossible(books, mid, nos)) {

				ans = mid;
				hi = mid - 1;
			} else {

				lo = mid + 1;
			}

		}

		System.out.println(ans);

	}

	public static boolean isItPossible(int[] books, int cap, int nos) {

		int students = 1;
		int pagesRead = 0;

		int currBook = 0;

		while (currBook < books.length) {

			if (pagesRead + books[currBook] <= cap) {
				pagesRead += books[currBook];
				currBook++;
			} else {

				students++;
				pagesRead = 0;
			}

			if (students > nos) {
				return false;
			}
		}
		return true;
	}

}
