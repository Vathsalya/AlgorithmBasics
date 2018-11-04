package assignment.arrays;

/****
 * Given an array that contains numbers from 1 to n-1 and exactly 1 duplicate,
 * find that duplicate.
 * 
 * @author Vathsalya
 *
 */
public class DuplicateElementFinder {

	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 1, 5, 5 }; // 1 to n-1 integers
		int duplicateNumber = findDuplicateElement(arr);
		System.out.println("Duplicate number :: " + duplicateNumber);
	}

	/***
	 * For every iteration remove the index from the value
	 * 
	 * @param arr
	 * @param numberRange
	 * @return
	 */
	private static int findDuplicateElement(int[] arr) {
		int carryOver = 0;
		for (int i = 0; i < arr.length; i++) {
			carryOver += (arr[i] - i);
		}
		return carryOver;
	}

}
