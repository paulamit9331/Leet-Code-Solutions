package SingleNumberAmongDoubles;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static Set<Integer> set = new HashSet<>();

	private static int singleNumber(int[] array) {
		for(int i : array) {
			if(set.contains(i))
				set.remove(i);		// to remove the duplicate
			else
				set.add(i);
		}

		for(int i : set) {
			return i;				// only single number
		}
		return -1;					// if the given array didn't contain any single number
	}

	public static void main(String[] args) {
		 int[] array = new int[] {4, 1, 2, 1, 2};

		 System.out.println(singleNumber(array));
	}
}