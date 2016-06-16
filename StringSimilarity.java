//problem - https://www.hackerrank.com/challenges/string-similarity

import java.util.*;

public class Solution {
	static long lenPrefMatch(String str, int suffInd){
		long prefMatchLen = 0;
        for(int i=0; i < str.length() && suffInd < str.length();i++){
            if(str.charAt(i) == str.charAt(suffInd)){
                prefMatchLen++;
                suffInd++;
            }
            else
                break;
        }
        return prefMatchLen;
	}
    // Head ends here 
    static long stringSimilarity(String a) {
        if(a == null || a == "")
            return 0;
        //List<String> suffixes = createSuff(a);
        long similarity = 0;
        for(int i=0; i < a.length(); i++){
            similarity += lenPrefMatch(a, i);
        }
        return similarity;
    }
    
    /* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long res;

        int _t_cases = Integer.parseInt(in.nextLine());
        for (int _t_i = 0; _t_i<_t_cases; _t_i++) {
            String _a = in.nextLine();
            res = stringSimilarity(_a);
            System.out.println(res);
        }
    }
}

