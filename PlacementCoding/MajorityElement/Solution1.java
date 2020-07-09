package MajorityElement;
import java.util.*;

public class Solution1 {
	private static Scanner sc = new Scanner(System.in);
	private static List<Integer> list = new ArrayList<Integer>();

	private static void majority(int[] array) {
		int n = array.length;
		int count = 0;
		for(int i = 0; i < n; i++) {
			if(!list.contains(array[i])) {
				if(count > (n / 2))
					break;
				
				list.add(array[i]);
				count = 1;
			} else {
				count++;
			}
		}
		if(count > (n / 2))
			System.out.println(list.get(list.size() - 1));
		else
			System.out.println("NONE");
	}

	public static void main(String[] args) {
		int[] array = new int[] {3, 3, 4, 4, 3, 3, 4, 4, 3};

		Arrays.sort(array);
		majority(array);
	}
}