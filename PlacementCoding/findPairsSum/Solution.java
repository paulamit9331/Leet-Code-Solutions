import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static void findPairSum(ArrayList<Integer> list, int sum) {
		ArrayList<Integer> temp = new ArrayList<>();

		for (Integer i : list) {
			if(!temp.contains(i))
				temp.add(sum - i);
			else
				System.out.println("(" + i + ", " + (sum - i) + ")");
		}
	}

	public static void main(String[] args) {
		String[] str = sc.nextLine().split(" ");
		ArrayList<Integer> list = new ArrayList<>();

		for (String s : str) 
			list.add(Integer.parseInt(s));

		int sum = Integer.parseInt(sc.next());
		findPairSum(list, sum);
	}
}