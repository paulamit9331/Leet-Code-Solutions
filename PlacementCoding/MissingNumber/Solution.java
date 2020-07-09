package MissingNumber;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int missingNumber(int[] array) {
		int n = array.length;
		int total = (n + 1) * (n + 2) / 2;

		for(int num : array)
			total -= num;

		return total;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 4, 6, 3, 7, 8};

		System.out.println(missingNumber(array));
	}
}