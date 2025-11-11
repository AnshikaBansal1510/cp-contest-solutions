package CodeforcesRound_1063;

import java.util.*;

public class C_problem {
 
    // is there a path from top left to bottom right such that all the values are in range [l, r]
    // cnt numver of all possible [l, r]
 
    // since we can move only R and D
    // there are exactly n possible paths we can take
    // every index i where we are moving D represent a new path
    // for each path prefixMin, prefixMax, suffixMax, suffixMin
    // then we can find in O(1) the min and max value in that path
    // for n paths we will get n conditions : [min, max]
    // cnt how (l, r) satisfy any one of these conditions
    // Given n segments (L,R) on a number line. (1 <= l,r <= 2n)
    // cnt how many (l, r) exist such that it contain atleast one segment
    // for every l , find min r such that it overlaps atleast one segment
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[][] a = new int[2][n];
 
            for(int idx = 0 ; idx < 2 ; idx++){
 
                for(int jdx = 0 ; jdx < n ; jdx++){
 
                    a[idx][jdx] = sc.nextInt();
                }
            }
 
            int[] suffMax = new int[n];
            int[] suffMin = new int[n];
 
            suffMax[n - 1] = a[1][n - 1];
            suffMin[n - 1] = a[1][n - 1];
 
            for(int idx = n - 2 ; idx >= 0 ; idx--){
 
                suffMax[idx] = Math.max(a[1][idx], suffMax[idx + 1]);
                suffMin[idx] = Math.min(a[1][idx], suffMin[idx + 1]);
            }
 
            int[] prefMax = new int[n];
            int[] prefMin = new int[n];
 
            prefMax[0] = a[0][0];
            prefMin[0] = a[0][0];
 
            for(int idx = 1 ; idx < n ; idx++){
 
                prefMax[idx] = Math.max(a[0][idx], prefMax[idx - 1]);
                prefMin[idx] = Math.min(a[0][idx], prefMin[idx - 1]);
            }
 
            int[] ans = new int[2 * n + 1];
            Arrays.fill(ans, (int) 1e9);
 
            for(int idx = 0 ; idx < n ; idx++){
 
                // for each possible n paths : [min, max]
                int min = Math.min(prefMin[idx], suffMin[idx]);
                int max = Math.max(prefMax[idx], suffMax[idx]);
 
                ans[min] = Math.min(ans[min], max);
            }
 
            // suffin min
            for(int idx = 2 * n - 1 ; idx >= 0 ; idx--){
 
                ans[idx] = Math.min(ans[idx], ans[idx + 1]);
            }
 
            long cnt = 0;
 
            for(int l = 1 ; l < ans.length ; l++){
 
                if(ans[l] != (int) 1e9){
 
                    cnt += (2 * n - ans[l] + 1);
                }
            }
 
            System.out.println(cnt);
        }
	}
}
