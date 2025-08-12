/*
 *   ************* Upsolved After Contest *************
 *   
 *   Problem Statement : Given two multisets S and T. In one operation:-
 *                      > we can remove x from S
 *                      > add (x + k) or |x - k| in S
 *                       We need to find whether S can be converted into T or not
 *   Logic : 
 *   > x can be converted to any multiple of k ( x -> x + ik )
 *   > x can be subtracted till resultant is greater than 0 ( x - ik > 0 )
 *   > when resultant becomes less than zero -> it becomes ( k - ( x - ik ) )
 *   > x :::: {x + ik} :::: {k - (x % k) + ik}
 *   > x :::: {x % k} + ik :::: {k - (x % k)} + ik
 * 
 *   T.C. - O(nlogn)
 */

package CodeforcesRound_1042; 

import java.util.*;

public class C_makeItEqual{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){

            int n = sc.nextInt();
            int k = sc.nextInt();

            HashMap<Integer,Integer> s = new HashMap<>();

            for(int idx = 0 ; idx < n ; idx++){

                int x = sc.nextInt();
                s.put(x % k, s.getOrDefault(x % k, 0) + 1);
                s.put(k - (x % k), s.getOrDefault(k - (x % k), 0) + 1);
            }

            for(int idx = 0 ; idx < n ; idx++){

                int x = sc.nextInt();
                s.put(x % k, s.getOrDefault(x % k, 0) - 1);
                s.put(k - (x % k), s.getOrDefault(k - (x % k), 0) - 1);
            }

            boolean possible = true;

            for(int val : s.values()){

                if(val != 0){

                    possible = false;
                    break;
                }
            }

            if(possible == true)    System.out.println("YES");
            else                    System.out.println("NO");
        }

        sc.close();
    }
}