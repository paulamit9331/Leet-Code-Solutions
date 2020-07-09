package MinimumDistance;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int minDistance(String array, String a, String b) {
		String str = array.substring(array.indexOf(a));
		int distance = str.indexOf(b) - str.indexOf(a);
		return distance;
	}

	public static void main(String[] args) {
		String[] array = "3,5,4,2,6,5,6,6,5,4,8,3".split(",");
		String str = "";

		for(String s : array)
			str += s;
		
		String a = "3";
		String b = "6";

		System.out.println(minDistance(str,a ,b));
	}
}