package PermutationOfString;
import java.util.*;

public class Solution1 {
	private static Scanner sc = new Scanner(System.in);
	private static Set<String> hash_Set = new HashSet<>();

	private static String swap(String str, int i, int j) {
		char[] charTemp = str.toCharArray();

		char temp = charTemp[i];
		charTemp[i] = charTemp[j];
		charTemp[j] = temp;

		return String.valueOf(charTemp);
	}

	private static void permute(String str, int l, int r) {
		if(l == r)
			hash_Set.add(str);				// without repeatation
			// System.out.print(str + " ");	// if we want to print every permutation including repeatation
		else
			for(int i = l; i <= r; i++) {
				str = swap(str, l, i);
				permute(str, l + 1, r);		// after fixing an alphabet recursive call
				str = swap(str, i, l);		// backtracking
			}
	}

	public static void main(String[] args) {
		String str = sc.next();

		permute(str, 0, str.length() - 1);

		hash_Set.forEach((n) -> System.out.print(n + " "));
	}
}