package CodechefStarters_222;

import java.util.Scanner;

public class A_candyTypes {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    int[] freq = new int[101];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        arr[idx] = sc.nextInt();
		        freq[arr[idx]]++;
		    }
		    
		    int max = (int) -1e9;
		    int res = -1;
		    
		    for(int idx = 1 ; idx <= 100 ; idx++){
		        
		        if(freq[idx] > max){
		            
		            max = freq[idx];
		            res = idx;
		        }
		    }
		    
		    System.out.println(res);
		}
	}
}
