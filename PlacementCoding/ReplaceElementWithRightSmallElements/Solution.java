package ReplaceElementWithRightSmallElements;
import java.util.Scanner;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static void replaceElements(int[] array) {
		int n = array.length;
		int maxFromRight = array[n - 1];

		array[n - 1] = -1;

		for(int i = n - 2; i >= 0; i--) {
			int temp = array[i];
			array[i] = maxFromRight;

			if(maxFromRight < temp)
				maxFromRight = temp;
		}

		for(int i : array)
			System.out.print(i + " ");
	}

	public static void main(String[] args) {
		int[] array = new int[] {16, 17, 4, 3, 5, 2};

		replaceElements(array);
	}
}