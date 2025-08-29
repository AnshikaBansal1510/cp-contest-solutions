package CodechefStarters_201;

import java.util.*;

public class B_markPoints {
	public static void main (String[] args) throws java.lang.Exception{

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
			
			int n = sc.nextInt();
			
			String s = sc.next();
			
			boolean possible = true;

			int cnt = 0;
			int ones = 0, zeroes = 0;
			
			for(int idx = 0 ; idx < s.length() ; idx++){
				
				if(s.charAt(idx) == '0')    zeroes++;
				else                        ones++;
			}
			
			if(ones == n || zeroes == n){
				
				System.out.println("YES");
				continue;
			}
			
			for(int idx = 0 ; idx < s.length() ; idx++){
				
				if(s.charAt(idx) == '1'){
					
					cnt++;
				}
				
				else{
					
					if(cnt > 0 && cnt <= 2){
						
						possible = false;
						break;
					}
					
					cnt = 0;
				}
			}
			
			if(cnt > 0 && cnt <= 2)    possible = false;
			
			if(possible == true)    System.out.println("YES");
			else                    System.out.println("NO");
		}

		sc.close();
	}
}
