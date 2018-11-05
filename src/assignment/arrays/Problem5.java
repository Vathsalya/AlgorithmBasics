package assignment.arrays;

/****
 * Search an element in an array where difference between adjacent elements is
 * 1. For example: arr[] = {8, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3}
 * 
 * Search for 3 and Output: Found at index 7
 * 
 * @author Vathsalya
 *
 */
public class Problem5 {

	public static void main(String[] args) {
		int[] arr = { 8, 4, 7, 6, 7, 6, 5, 4, 3, 2, 3, 4, 3 };
		int index = search(arr, 6);
		if (-1 == index)
			System.out.println("There is no such number");
		else
			System.out.println("Number found at " + index);
	}

	static int search(int[] arr, int numberToSearch) {
		if (arr != null && !(arr.length > 0))
			return -1;
		for (int i = 1; i < arr.length - 2; i++) {
			if (numberToSearch == arr[i]) {
				if (1 == (Math.abs(arr[i] - arr[i - 1])) && 1 == (Math.abs(arr[i] - arr[i + 1]))) {
					return i;
				}
			}
		}
		return -1;
	}

}
