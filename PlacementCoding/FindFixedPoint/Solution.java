package FindFixedPoint;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int fixedPointElement(int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == i) {
				return array[i];
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] array = new int[] {-10, -5, 0, 3, 7};

		System.out.println(fixedPointElement(array));
	}
}