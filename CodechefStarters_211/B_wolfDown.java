package CodechefStarters_211;

import java.util.Scanner;

public class B_wolfDown {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    String s = sc.next();
		    
		    int safe = 0;
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        if(s.charAt(idx) != '1'){
		            
		            safe++;
		        }
		        
		        else        break;
		    }
		    
		    System.out.println(safe);
		}

		sc.close();
	}
}
