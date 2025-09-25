package CodeforcesRound_1054;

import java.util.Scanner;

public class C_mexRose {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            int[] a = new int[n];
            boolean[] present = new boolean[k];

			int equal = 0;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
 
                if(a[idx] < k)      present[a[idx]] = true;
                if(a[idx] == k)     equal++;
            }
 
            int missing = 0;
 
            for(boolean val : present){
 
                if(val == false)    missing++;
            }
 
            System.out.println(Math.max(missing, equal));
		}

		sc.close();
	}
}
