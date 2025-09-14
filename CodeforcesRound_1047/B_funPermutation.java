package CodeforcesRound_1047;

import java.util.Scanner;

public class B_funPermutation {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[] p = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                p[idx] = sc.nextInt();
            }
 
            for(int idx = 0 ; idx < n ; idx++){
 
                System.out.print((n + 1) - p[idx] + " ");
            }
 
            System.out.println();
		}

		sc.close();
	}
}
