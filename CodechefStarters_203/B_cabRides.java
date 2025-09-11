package CodechefStarters_203;

import java.util.Scanner;

public class B_cabRides {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int div = n / 2;
		    int mod = n % 2;
		    
		    if(n % 2 == 0){
		        
		        System.out.println(div * 200);
		    }
		    
		    else if(n == 1){
		        
		        System.out.println(200);
		    }
		    
		    else{
		        
		        int ans = (div * 200) + (mod * 100);
		        
		        System.out.println(ans);
		    }
		}

		sc.close();
	}
}
