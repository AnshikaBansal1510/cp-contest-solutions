package CodeforcesRound_1046;

import java.util.*;

public class B_likeTheBitset {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();
            int k = sc.nextInt();
 
            String s = sc.next();
 
            int cnt_ones = 0;
            boolean possible = true;
 
            for(int idx = 0 ; idx < s.length() ; idx++){
 
                if(s.charAt(idx) == '1'){
 
                    cnt_ones++;
                }
 
                else{
 
                    if(cnt_ones >= k){
 
                        possible = false;
                        break;
                    }
 
                    cnt_ones = 0;
                }
            }
 
            if(cnt_ones >= k){
 
                possible = false;
            }
 
            if(possible == false){
 
                System.out.println("NO");
                continue;
            }
 
            System.out.println("YES");
 
            int[] res = new int[n];
            int first = 1, last = n;
 
            for(int idx = 0 ; idx < n ; idx++){
 
                if(s.charAt(idx) == '1'){
 
                    res[idx] = first;
                    first++;
                }
 
                else{
 
                    res[idx] = last;
                    last--;
                }
            }
 
            for(int idx = 0 ; idx < n ; idx++){
 
                System.out.print(res[idx] + " ");
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}

