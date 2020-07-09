import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static void findDuplicates(ArrayList<Integer> list) {
		Map<Integer, Integer> map = new HashMap<>();

		for (Integer i : list)
			map.put(i, map.getOrDefault(i, 0) + 1);

		for(Integer i : map.keySet()) {
			if(map.get(i) > 1)
				System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		String[] str = sc.nextLine().split(" ");

		for (String s : str)
			list.add(Integer.parseInt(s));

		findDuplicates(list);
	}
}