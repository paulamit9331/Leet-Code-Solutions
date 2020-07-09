package LeaderArray;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static void leaders(int[] array, int l, int r) {
		boolean flag;

		for(int i = l; i < r; i++) {
			for(int j = i + 1; j <= r; j++) {
				if(array[i] < array[j]) {
					r = j + 1;

				}
			}
		}
		System.out.println(array[r]);
	}

	public static void main(String[] args) {
		int[] array = new int[] {16, 17, 4, 3, 5, 2};

		leaders(array, 0, array.length - 1);
	}
}