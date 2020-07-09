package FindPeakElements;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int findPeakElement(int[] array) {
		for(int i = 1; i < array.length - 1; i++) {
			if(array[i] > array[i - 1] && array[i] > array[i + 1]) {
				return array[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[] {10, 20, 15, 2, 23, 90, 67};

		System.out.println(findPeakElement(array));
	}
}