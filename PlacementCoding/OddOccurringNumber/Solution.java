package OddOccurringNumber;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Integer> list = new ArrayList<Integer>();

	private static void majority(int[] array) {
		int n = array.length;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(!list.contains(array[i])) {
				if(count % 2 != 0)
					break;
				
				list.add(array[i]);
				count = 1;
			} else {
				list.add(array[i]);
				count++;
			}
		}
		System.out.println(list.get(list.size() - 1));
	}

	public static void main(String[] args) {
		int[] array = new int[] {1, 2, 3, 2, 3, 1, 3};

		Arrays.sort(array);
		majority(array);
	}
}