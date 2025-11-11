package CodeforcesRound_1063;

import java.util.Scanner;

public class B_problem {
	
	// except first and last index
    // and min and max ele index will remain zero
    // rest all can be changed to 1
 
    // [min ele ind, max ele ind]
    // [0, min ele ind]
    // [0, max ele ind]
    // [min ele ind, n - 1]
    // [max ele ind, n - 1]
 
    // [0, a] [0, b] -> 0, min(a, b)
    // [a, n-1] [b,n-1] -> max(a, b), n - 1
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++)      a[idx] = sc.nextInt();
 
            String x = sc.next();
 
            if(x.charAt(0) == '1' || x.charAt(n - 1) == '1'){
 
                System.out.println(-1);
                continue;
            }
 
            int ind1 = -1, ind2 = -1;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                if(a[idx] == 1){
 
                    ind1 = idx;
                }
 
                if(a[idx] == n){
 
                    ind2 = idx;
                }
            }
 
            if(x.charAt(ind1) == '1' || x.charAt(ind2) == '1'){
 
                System.out.println(-1);
                continue;
            }
 
            ind1++;
            ind2++;
 
            int[][] ans = {{1, ind1}, {1, ind2}, {ind1, n}, {ind2, n}, {Math.min(ind1, ind2), Math.max(ind1, ind2)}};
 
            System.out.println(5);
 
            for(int[] op : ans){
 
                System.out.println(op[0] + " " + op[1]);
            }
        }
	}
}
