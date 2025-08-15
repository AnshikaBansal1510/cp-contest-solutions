/*   ************* Upsolved After Contest *************
 *   
 *   Problem Statement : Given an array A
 *                      > ai = ai ^ ai+1 (can be performed atmost once for an i)
 *                       We need to find whether A can be converted into B or not
 *   Logic : 
 *   > index i can only be used to change value of (i - 1) and i
 *   > (i - 1) => (i - 1) ^ i
 *   > i => i ^ (i + 1)
 *   > value of an index can be changed atmost once
 *   > one index will have atmost two different values at any point during operation (before and after operation)
 * 	 > First traverse from left to right to check if initial values can make ai equal to bi : if yes change ai => bi
 *   > then go from right to left to check if final values xor can make them equal
 * 
 *   T.C. - O(n)
 */

package CodeforcesRound_1042; 

import java.util.*;

public class E_adjacentXOR {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0){

			int n = sc.nextInt();

			int[] a = new int[n];
			int[] b = new int[n];

			for(int idx = 0 ; idx < n ; idx++){

				a[idx] = sc.nextInt();
			}

			for(int idx = 0 ; idx < n ; idx++){

				b[idx] = sc.nextInt();
			}

			for(int idx = 0 ; idx < n - 1 ; idx++){

				if((a[idx] ^ a[idx + 1]) == b[idx])	a[idx] = b[idx];
			}

			for(int idx = n - 2 ; idx >= 0 ; idx--){

				if((a[idx] ^ a[idx + 1]) == b[idx])	a[idx] = b[idx];
			}

			boolean possible = true;

			for(int idx = 0 ; idx < n ; idx++){

				if(a[idx] != b[idx]){

					possible = false;
					break;
				}
			}

			if(possible == true)	System.out.println("YES");
			else 					System.out.println("NO");
		}

		sc.close();
	}
}
