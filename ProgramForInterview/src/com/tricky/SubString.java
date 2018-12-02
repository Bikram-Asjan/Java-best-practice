package com.tricky;

import java.util.Arrays;
import java.util.HashSet;

public class SubString {
	public static String longestUniqueString(String S) {
	    int start=0, end=0, length=0;
	    boolean bits[] = new boolean[256];
	    int x=0, y=0;
	    for(;x<S.length() && y<S.length() && length < S.length()-x;x++) {
	        Arrays.fill(bits, false);
	        bits[S.charAt(x)]=true;
	        for(y=x+1;y<S.length() && !bits[S.charAt(y)];y++) {
	            bits[S.charAt(y)]=true;
	        }           
	        if(length<y-x) {
	            start=x;
	            end=y;
	            length=y-x;
	        }
	    }
	    return S.substring(start,end);
	}
    public static String subString(String input){

        HashSet<Character> set = new HashSet<Character>();

        String longestOverAll = "";
        String longestTillNow = "";

        for (int i = 0; i < input.length() - 1; i++) {
            char c = input.charAt(i);

            if (set.contains(c)) {
                longestTillNow = "";
                set.clear();
            }
            longestTillNow += c;
            set.add(c);
            if (longestTillNow.length() > longestOverAll.length()) {
                longestOverAll = longestTillNow;
            }
        }

        return longestOverAll;
    }

    public static void main(String[] args) {
        String input1 = "abhddcdaggff";
        System.out.println(subString(input1));
        
        
        System.out.println(longestUniqueString(input1));
        
        String input[][] = { { "" }, { "a" }, { "ab" }, { "aab" }, { "abb" },
                { "aabc" }, { "abbc" }, { "aabbccdefgbc" },
                { "abcdeafghicabcdefghijklmnop" },
                { "abcdeafghicabcdefghijklmnopqrabcdx" },
                { "zxxaabcdeafghicabcdefghijklmnopqrabcdx" },
                {"aaabcdefgaaa"}};
        for (String[] a : input) {
            System.out.format("%s  *** GIVES ***  {%s}%n", Arrays.toString(a),
                    longestUniqueString(a[0]));
        }
        
        
    }
}