package collection.framework.pure.collection;

public class MaxSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static int maximumIndex(int steps, int badIndex) {

		int currentIndex = 0;
		int j = 1;

		for (int step = 1; step <= steps; step++) {
			// Check if moving to the bad element should be avoided
			if (currentIndex + j == badIndex) {
				// If avoiding, don't move and increment j
				j++;
			} else {
				// If not avoiding, move to the next index
				currentIndex += j;
				j++;
			}
		}

		return currentIndex;
	}

}
