package UnionOfTwoArray;
import java.util.*;

public class Solution2 {
	private static Scanner sc = new Scanner(System.in);

	private static void arrayUnion(int[] array1, int[] array2) {
		int i = 0;
		int j = 0;

		while(i < array1.length && j < array2.length) {
			if(array1[i] < array2[j])
				System.out.print(array1[i++] + " ");

			else if(array2[j] < array1[i])
				System.out.print(array2[j++] + " ");

			else {
				System.out.print(array1[i++] + " ");
				j++;
			}
		}

		while(i < array1.length)
			System.out.print(array1[i++] + " ");
		
		while(j < array2.length)
			System.out.print(array2[j++] + " ");
	}

	public static void main(String[] args) {
		int[] array1 = new int[] {1, 2, 4, 5, 6};
		int[] array2 = new int[] {2, 3, 5, 7};

		arrayUnion(array1, array2);
	}
}