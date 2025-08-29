package CodeforcesRound_1044;

import java.util.*;

public class A_Redstone {
	public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();
 
            HashMap<Integer,Integer> map = new HashMap<>();
 
            for(int idx = 0 ; idx < n ; idx++){
 
                int num = sc.nextInt();
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
 
            boolean possible = false;
 
            for(int val : map.values()){
 
                if(val >= 2){
 
                    possible = true;
                    break;
                }
            }
 
            if(possible == true)    System.out.println("YES");
            else                    System.out.println("NO");
        }

		sc.close();
    }
}
