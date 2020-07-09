package UnionOfTwoArray;
import java.util.*;

public class Solution1 {
	private static Scanner sc = new Scanner(System.in);
	private static Set<Integer> hash_set = new HashSet<>();

	private static void arrayUnion(int[] array1, int[] array2) {
		for(int i : array1)
			hash_set.add(i);

		for(int i : array2)
			hash_set.add(i);
	}

	public static void main(String[] args) {
		int[] array1 = new int[] {1, 2, 4, 5, 6};
		int[] array2 = new int[] {2, 3, 5, 7};

		arrayUnion(array1, array2);

		System.out.print(hash_set);
	}
}