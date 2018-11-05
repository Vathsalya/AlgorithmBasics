package assignment.arrays;

public class Problem3 {

	public static void main(String[] args) {
		// int arr[] = { 8, 9, 10, 11, 2, 3, 4 };

		int arr[] = { 18, 19, 10, 11, 12, 13, 14 };
		int searchElement = 11;

		int numberOfRotations = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				numberOfRotations = i + 1;
				break;
			}
		}
		//System.out.println(numberOfRotations);
		int index = -1;
		if (numberOfRotations > 0) {
			if (searchElement >= arr[0] && searchElement <= arr[numberOfRotations - 1]) {
				index = findElementInSortedArray(0, numberOfRotations - 1, arr, searchElement);
			} else {
				index = findElementInSortedArray(numberOfRotations - 1, arr.length - 1, arr, searchElement);
			}

		} else {
			index = findElementInSortedArray(0, arr.length - 1, arr, searchElement);
		}

		if (index == -1)
			System.out.println("Number not found in the array");
		else
			System.out.println("Number found at the index " + index);

	}

	private static int findElementInSortedArray(int low, int high, int[] arr, int searchElement) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (searchElement == arr[mid]) {
			return (mid);
		}

		if (searchElement >= arr[low] && searchElement <= arr[mid]) {
			return findElementInSortedArray(low, (mid - 1), arr, searchElement);
		} else {
			return findElementInSortedArray((mid + 1), high, arr, searchElement);
		}
	}

}
