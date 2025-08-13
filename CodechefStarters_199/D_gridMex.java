package CodechefStarters_199;

import java.util.*;

public class D_gridMex {

	public static void reverse(int[] arr, int start, int end) {
        
        while (start < end) {
			
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    
    public static void leftRotate(int[] arr, int k) {
        
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
            
        for(int idx = 0 ; idx < n ; idx++){
            
            System.out.print(arr[idx] + " ");
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		while(t-- > 0){
		    
		    int n = sc.nextInt();
		    
		    int[] a = new int[n];
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        a[idx] = idx;
		    }
		    
		    for(int idx = 0 ; idx < n ; idx++){
		        
		        System.out.print(a[idx] + " ");
		    }
		    
		    System.out.println("");
		    
		    for(int idx = 1 ; idx < n ; idx++){
		        
		        int[] copy = Arrays.copyOf(a, n);
		        leftRotate(copy, idx);
		        System.out.println("");
		    }
		}

		sc.close();
	}
}
