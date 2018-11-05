package assignment.arrays;

public class Problem6 {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 5, 11 };
		int arrElementsWithoutSum[] = new int[arr.length - 1];
		int sumArr[] = new int[1];
		int sum = 0;
		System.out.print("Element array: { ");
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(" ,");
		}
		System.out.println(" }");

		sumArr[0] = sum / 2;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != sumArr[0]) {
				arrElementsWithoutSum[j] = arr[i];
				j++;
			}

		}

		System.out.println("Sum Array { " + sumArr[0] + " }");
		System.out.print("Element array without sum : { ");
		for (int i = 0; i < arrElementsWithoutSum.length; i++) {
			System.out.print(arrElementsWithoutSum[i]);
			if (i != arrElementsWithoutSum.length - 1)
				System.out.print(" ,");
		}
		System.out.print(" }");
	}

}
