package assignment.arrays;
/***
 * Find the element that appears once in a sorted array where all other elements
 * appear twice one after another. Find that element in 0(logn) complexity.
 * Input: arr[] = {1, 1, 3, 3, 4, 5, 5, 7, 7, 8, 8} Output: 4
 * 
 * @author Vathsalya
 *
 */
public class NonRepeatingElementFinder {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 2, 2, 4, 5, 5, 6, 6, 7, 7 };
		// int arr[] = { 1, 1, 2, 2, 4, 5, 5 };
		// int arr[] = {0,1,1,2,2};
		// int arr[] = {1,1,2,2,3};
		// int arr[] = {1,1,2,2,3,3};
		if (arr != null && arr.length != 0) {
			if (arr.length % 2 == 0) {
				System.out.println("All elements are paired");
			} else {
				System.out.println(findNonRepeatingElement(0, arr.length - 1, arr));
			}
		}
	}

	/***
	 * 1. Array is sorted - we can do a binary search to find the element 2. Each
	 * element appear twice once after other - First occurrence is at even index and
	 * second at odd index 3. Only one element can appear once
	 * 
	 * @param low
	 * @param high
	 * @param arr
	 * @return
	 */
	private static int findNonRepeatingElement(int low, int high, int[] arr) {

		if (low > high)
			return -1;

		if (low == high) {
			return arr[low];
		}

		int mid = (low + high) / 2;

		if (mid % 2 == 0) { // even
			if (arr[mid] == arr[mid + 1]) {
				return findNonRepeatingElement(mid + 2, arr.length - 1, arr);
			} else {
				return findNonRepeatingElement(low, mid, arr);
			}
		} else {
			if (arr[mid] == arr[mid - 1]) {
				return findNonRepeatingElement(mid + 1, high, arr);
			} else {
				return findNonRepeatingElement(low, mid - 1, arr);
			}
		}
	}

}
