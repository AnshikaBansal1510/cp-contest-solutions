package CodeforcesRound_1042;

import java.util.Scanner;

public class B_alternatingSeries {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt(); 
 
        while (t-- > 0) {
            
            int n = sc.nextInt();  
            
            if(n == 2){
 
                System.out.println(-1 + " " + 2 + " ");
                continue;
            }
 
            else if(n % 2 == 1){
 
                for(int idx = 1 ; idx <= n ; idx++){
 
                    if(idx % 2 == 1){
 
                        System.out.print(-1 + " ");
                    }
 
                    else{
 
                        System.out.print(3 + " ");
                    }
                }
            }
 
            else if(n % 2 == 0){
 
                for(int idx = 1 ; idx <= n - 1 ; idx++){
 
                    if(idx % 2 == 1){
 
                        System.out.print(-1 + " ");
                    }
 
                    else{
 
                        System.out.print(3 + " ");
                    }
                }
 
                System.out.print(2);
            }
 
            System.out.println();
		}	

		sc.close();
	}
}
