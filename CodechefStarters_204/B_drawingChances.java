package CodechefStarters_204;

import java.util.Scanner;

public class B_drawingChances {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int m = sc.nextInt();
		    
		    String s = sc.next();
		    
		    int alice = 0, bob = 0;
		    
		    for(int idx = 0 ; idx < s.length() ; idx++){
		        
		        if(s.charAt(idx) == '1')	alice++;
		        
		        else    					bob++;
		    }
		    
		    if(m < n){
		        
		        if(alice == bob && (n - m) % 2 == 0){
		            
		            System.out.println("Yes");
		        }
		        
		        else if(alice != bob){
		            
		            int diff = Math.abs(alice - bob);
		            int left = (n - m);
		            
		            left -= diff;
		            
		            if(left < 0){
		                
		                System.out.println("No");
		            }
		            
		            else if(left == 0){
		                
		                System.out.println("Yes");
		            }
		            
		            else if(left % 2 == 0){
		                
		                System.out.println("Yes");
		            }
		            
		            else{
		                
		                System.out.println("No");
		            }
		        }
		        
		        else{
		            
		            System.out.println("No");
		        }
		    }
		    
		    else if(m == n){
		        
		        if(alice == bob){
		            
		            System.out.println("Yes");
		        }
		        
		        else{
		            
		            System.out.println("No");
		        }
		    }
		}

		sc.close();
	}
}
