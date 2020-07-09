package PowerOfTwo;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static boolean isPower(int n) {
		int temp = 1;
		while(temp < n ) {
			temp *= 2;
		}
		return temp == n;
	}

	public static void main(String[] args) {
		int n = sc.nextInt();

		if(isPower(n))
			System.out.println(true);
		else
			System.out.println(false);
	}
}