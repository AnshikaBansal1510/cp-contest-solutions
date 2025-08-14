/*   ************* Upsolved After Contest *************
 *   
 *   Problem Statement : Given a tree
 *                      > choose a path from 'u' to 'v' and remove all edges between this path and connect it to 'u'
 *                       We need to minimize the number of operations to get tree with the minimum diameter
 *   Logic : 
 *   > diameter is the length of longest path in a tree
 *   > for any tree with n > 2 it will have a path of length 3 => (diameter >= 3)
 *   > aim should be to keep one node at center and all other nodes are connected to it (sun like structure)
 *   > we need to count number of leaf nodes not directly attached to the center node
 *   > ans = minimum of this taking each node as center node 
 *   > op = (total leaf count) - (number of adjacent leafs) - 1(if center node if leaf node itself)
 * 
 *   T.C. - O(n + m) (for each node we are checking for children == number of edges)
 */

package CodeforcesRound_1042;

import java.util.*;
 
public class D_arborisContractio {  
 
	public static int isLeaf(List<List<Integer>> adj, int node){
	
		if(adj.get(node).size() == 1)   return 1;
	    return 0;
   	}
    public static void main(String[] args) {
	 
        Scanner sc = new Scanner(System.in);
 
	    int t = sc.nextInt();
 
	    while(t-- > 0){
 
	        int n = sc.nextInt();
 
	        List<List<Integer>> adj = new ArrayList<>();
 
	        for(int idx = 0 ; idx <= n ; idx++){
 
		        adj.add(new ArrayList<>());
	        }
 
	        for(int idx = 1 ; idx < n ; idx++){
 
		        int u = sc.nextInt();
		        int v = sc.nextInt();
		        adj.get(u).add(v);
		        adj.get(v).add(u);
	        }
 
	        int totalLeaf = 0;
 
	        for(int idx = 0 ; idx <= n ; idx++){

		        totalLeaf += isLeaf(adj, idx);
	        }
 
	        int ans = Integer.MAX_VALUE;
 
	        for(int idx = 0 ; idx <= n ; idx++){

		        int cnt = totalLeaf - isLeaf(adj, idx);

		        for(int jdx : adj.get(idx)){
 
		            cnt -= isLeaf(adj, jdx);
		        }
		    
                ans = Math.min(ans, cnt);
	        }
 
	        System.out.println(ans);
	    }
 
	    sc.close();
    }
 }
 