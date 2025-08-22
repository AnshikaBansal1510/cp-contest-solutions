//  T.C. - O(n)

package CodeforcesRound_1043;

import java.util.*;

public class A_homework {
	public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();
 
            String a = sc.next();
 
            int m = sc.nextInt();
 
            String b = sc.next();
 
            String s = sc.next();
 
            StringBuilder sb = new StringBuilder(a);
 
            for(int idx = 0 ; idx < s.length() ; idx++){
 
                if(s.charAt(idx) == 'D'){
 
                    sb.append(b.charAt(idx));
                }
 
                else{
 
                    sb.insert(0, b.charAt(idx));
                }
            }
 
            for(int idx = 0 ; idx < sb.length() ; idx++){
 
                System.out.print(sb.charAt(idx));
            }
            
            System.out.println();
        }

		sc.close();
    }
}
