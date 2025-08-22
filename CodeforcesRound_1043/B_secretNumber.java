/*
 *  Problem Statement : Given a number 'x'
 *                      'y' is obtained by appending >= 1 number of zeroes
 *                      n = x + y.... find all 'x' that could give this 'n'
 *   Logic : 
 *   > y = x * 10^k , k >= 1
 *   > n = x + y
 *   > n = x + (x * 10^k)
 *   > n = x (1 + 10^k)
 *   > since x is an integer....n must be divisible by (1 + 10^k)
 * 
 *   T.C. - O(18 * t)
 */

package CodeforcesRound_1043;

import java.util.*;

public class B_secretNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0){

			long n = sc.nextLong();

			List<Long> res = new ArrayList<>();

			long power = 10;

			while(power + 1 <= n){

				if(n % (power + 1) == 0)		res.add(n / (power + 1));
				power *= 10;
			}

			Collections.sort(res);

			if(res.size() == 0){

				System.out.println(0);
			}

			else{

				System.out.println(res.size());

				for(long x : res){

					System.out.print(x + " ");
				}

				System.out.println();
			}
		}

		sc.close();
	}
}
