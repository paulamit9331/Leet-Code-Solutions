package NumberofIsland;
import java.util.*;

public class Solution {
	private static Scanner sc = new Scanner(System.in);

	private static int numIslands(char[][] grid) {
		if(grid == null || grid.length == 0)
			return 0;

		int islandCount = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				
				if(grid[i][j] == '1')
					islandCount += dfs(grid, i, j);		// to count number of islands or connected '1'
			}
		}
		return islandCount;
	}

	private static int dfs(char[][] grid, int i, int j) {
		if(i < 0 || i > grid.length || j < 0 || j > grid[i].length || grid[i][j] == '0')
			return 0;

		grid[i][j] = '0';		//making the node 0 which has been traversed and traversing its adjacent elements

		dfs(grid, i - 1, j);	// to check its upper element
		dfs(grid, i + 1, j);	// to check its lower element
		dfs(grid, i, j + 1);	// to check its right element
		dfs(grid, i, j - 1);	// to check its left element

		return 1;
	}

	public static void main(String[] args) {
		
		char[][] grid = {{'1','1','1','1','0'},
						 {'1','1','0','1','0'},
						 {'1','1','0','0','0'},
						 {'0','0','0','0','0'}};

		System.out.println(numIslands(grid));
	}
}