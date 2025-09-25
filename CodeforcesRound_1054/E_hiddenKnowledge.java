package CodeforcesRound_1054;

import java.util.*;

public class E_hiddenKnowledge {

	public static long solve(int[] a, int k, int length){
 
        if(k < 0 || length <= 0)    return 0;
 
        int start = 0;
        int end = 0;
        Map<Integer,Integer> map = new HashMap<>();
        long cnt = 0;
 
        while(end < a.length){
 
            map.put(a[end], map.getOrDefault(a[end], 0) + 1);
 
            while(map.size() > k || (end - start + 1) > length){
 
                map.put(a[start], map.getOrDefault(a[start], 0) - 1);

                if(map.get(a[start]) == 0){
 
                    map.remove(a[start]);
                }
 
                start++;
            }
 
            cnt += (long) (end - start + 1);
            end++;
        }
 
        return cnt;
    }

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while(t-- > 0){
 
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
 
            int[] a = new int[n];
 
            for(int idx = 0 ; idx < n ; idx++){
 
                a[idx] = sc.nextInt();
            }
 
            long cnt_l = solve(a, k, l - 1);
            long cnt_r = solve(a, k, r);
 
            long cnt_l2 = solve(a, k - 1, l - 1);
            long cnt_r2 = solve(a, k - 1, r);
 
            System.out.println((cnt_r - cnt_l) - (cnt_r2 - cnt_l2));
		}

		sc.close();
	}
}
