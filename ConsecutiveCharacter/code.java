//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String S = read.readLine().trim();
            
            Solution ob = new Solution();
            String ans = ob.removeConsecutiveCharacter(S);
            
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution{
    public String removeConsecutiveCharacter(String S){
        
        Stack<Character> st = new Stack<>();
        st.push(S.charAt(0));

        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != st.peek()) {
                st.push(S.charAt(i));
            }
        }


        StringBuilder sb = new StringBuilder();

        while (!st.isEmpty()) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
        
    }
}