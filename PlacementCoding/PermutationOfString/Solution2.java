
import java.util.*;

public class Solution2 {
	private static Scanner sc = new Scanner(System.in);
	private static Set<String> hash_Set = new HashSet<>();

	private static void permute(String str, String result) {
		if(str.length() == 0)
			hash_Set.add(result);
			// System.out.print(result + " ");
		else {
			for(int i = 0; i < str.length(); i++) {
				char temp = str.charAt(i);

				String restOfString = str.substring(0, i) + str.substring(i + 1);
				permute(restOfString, result + temp);
			}
		}
	}

	public static void main(String[] args) {
		String str = sc.next();

		permute(str, "");
		hash_Set.forEach((n) -> System.out.print(n + " "));
	}
}