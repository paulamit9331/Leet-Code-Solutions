package FIZZBIZZ;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);
	private static List<String> list = new ArrayList<String>();

	private static void fizzBizz(int n) {
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0)
				list.add("FizzBizz");
			else if(i % 3 == 0)
				list.add("Fizz");
			else if(i % 5 == 0)
				list.add("Bizz");
			else
				list.add(String.valueOf(i));
		}
		System.out.println(list);
	}

	public static void main(String[] args) {
		int n = 15;

		fizzBizz(n);
	}
}