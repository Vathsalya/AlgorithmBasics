package assignment.arrays;
/****
 * A magic index in an array A[0…n-1] is defined to be an index such that A[i] =
 * i. Given a sorted array of distinct integers, write a method to find a magic
 * index if one exists, in an array A. FOLLOW UP: What if the values are not
 * distinct?
 * 
 * @author Vathsalya
 *
 */
public class MagicIndexFinder {

	public static void main(String[] args) {
		 int arr[] = {-11, -1, 0, 3, 10, 18, 20, 50};
		// int arr[] = {0, 1, 23, 30};
		// int arr[] = { 0 };
		if (arr != null && arr.length != 0) {
			int index = findMagicIndex(0, arr.length - 1, arr);
			if(index == -1) {
				System.out.println("There is no magic index");
			} else {
				System.out.println("Magic index is found at the index "+index);
			}
		}

	}

	private static int findMagicIndex(int low, int high, int[] arr) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;
		if (arr[mid] == mid) {
			return arr[mid];
		}

		if (arr[mid] > mid) {//Value greater than mid
			return findMagicIndex(low, mid - 1, arr);
		} else {
			return findMagicIndex(mid + 1, high, arr);
		}
	}

}
