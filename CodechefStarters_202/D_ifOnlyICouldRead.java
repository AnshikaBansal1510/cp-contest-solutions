package CodechefStarters_202;

import java.util.Scanner;

public class D_ifOnlyICouldRead {
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    int[] arr = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        arr[idx] = sc.nextInt();
		    }
		    
		    boolean possible = false;
		    int[] ans = new int[2];
		    
            for(int idx = 0 ; idx < n - 1 ; idx++){
                
                if (arr[idx] > arr[idx + 1]) {

                    ans[0] = idx + 1;
                    ans[1] = idx + 2;
                    possible = true;
                    break;
                }
            }

            if(possible == false){
                
                System.out.println(-1);
            }
            
            else{
                
                System.out.println(ans[0] + " " + ans[1]);
            }
		}

		sc.close();
	}
}
