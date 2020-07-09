package ContainsDuplicate;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Set<Integer> set = new HashSet<Integer>();

	private static boolean isDuplicatePresent(int[] array) {
		for(int i : array) {
			if(set.contains(i))
				return true;
			else
				set.add(i);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 4, 5};

		if(isDuplicatePresent(array))
			System.out.println(true);
		else
			System.out.println(false);
	}
}