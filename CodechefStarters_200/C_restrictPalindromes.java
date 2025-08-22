package CodechefStarters_200;

import java.util.*;

public class C_restrictPalindromes {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int rounds = n / 5;
		    String s = "abcde";
		    String res = "";
		    
		    for(int idx = 1 ; idx <= rounds ; idx++){
		        
		        res += s;
		    }
		    
		    int rem = n - (rounds * 5);
		    
		    for(int idx = 0 ; idx < rem ; idx++){
		        
		        res += s.charAt(idx);
		    }
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        System.out.print(res.charAt(idx));
		    }
		    
		    System.out.println();
		}

		sc.close();
	}
}
