//problem: https://www.hackerrank.com/challenges/sherlock-and-divisors

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tests = in.nextInt();
        int[] inp = new int[tests];
        for(int i=0; i<tests; i++) {
            inp[i] = in.nextInt();
        }
        for(int i=0; i<tests; i++) {
            int divisors = getDivisors(inp[i]);
            System.out.println(divisors);
        }
    }
    
    static int getDivisors(int inp) {
        int count = 0;
        for(int i=(int)Math.sqrt(inp); i >=2; i--) {
            if(inp % i == 0) {
                if(i%2 == 0)
                    count++;
                if(i == (inp/i))
                    continue;
                if((inp/i)%2 ==0)
                    count++;
            }
        }
        if(inp%2 == 0)
           count++;
        return count;
    }
}