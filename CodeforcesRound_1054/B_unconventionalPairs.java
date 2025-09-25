package CodeforcesRound_1054;

import java.util.*;;

public class B_unconventionalPairs {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
            }
 
            Arrays.sort(a);
			
            int max = Integer.MIN_VALUE;
 
            for(int idx = 0 ; idx < n - 1 ; idx += 2){
 
                int diff = Math.abs(a[idx] - a[idx + 1]);
                max = Math.max(max, diff);
            }
 
            System.out.println(max);
		}

		sc.close();
	}
}
