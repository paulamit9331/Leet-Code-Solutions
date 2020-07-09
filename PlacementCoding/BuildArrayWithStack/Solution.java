package BuildArrayWithStack;
import java.util.*;

public class Solution {
    private static List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<String>();
        List<Integer> targetL = new ArrayList<Integer>();
        for(int i : target)
        	targetL.add(i);
        System.out.println(targetL);
        
        for(int i = 1; i <= target[target.length - 1]; i++) {
            list.add("Push");
            if(targetL.contains(i))
                continue;
            list.add("Pop");
        }
        return list;
    }

    public static void main(String[] args) {
    	int[] target = new int[] {3, 4, 5, 8, 9, 10};
    	int n = 10;

    	System.out.println(buildArray(target, n));
    }
}