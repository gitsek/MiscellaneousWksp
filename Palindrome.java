package workoutPkg;

import java.util.Scanner;

/* 
 * Check to see if a string is a palindrome.
 */
public class Palindrome {

	static boolean isPalindrome(String str) {
		char[] strArray = str.toCharArray();
		int len = strArray.length;
		for(int i = 0, j = len-1; i < len >> 1; i++ , j--) {
			if (strArray[i] != strArray[j]) {
				return false;
			}
		}
		return true;
	}
	
	static String getLongestPalindrome(String str) { 
		String longestPalinStr = "";
		int strLen = str.length();
		
		for(int i = 0; i < strLen; i++) {
			if(str.charAt(i) == str.charAt(i+1)) {
				
			}
		}
		return longestPalinStr;
	}
	
	public static String longestPalindromeDP(String s) {
	    if(s==null || s.length()<=1)
	        return s;
	 
	    int len = s.length();
	    int maxLen = 1;
	    boolean [][] dp = new boolean[len][len];
	 
	    String longest = null;
	    for(int l=0; l<s.length(); l++){
	        for(int i=0; i<len-l; i++){
	            int j = i+l;
	            if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
	                dp[i][j]=true;
	 
	                if(j-i+1>maxLen){
	                   maxLen = j-i+1; 
	                   longest = s.substring(i, j+1);
	                }
	            }
	        }
	    }
	 
	    return longest;
	}
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string to verify if its a palindrome");
		String palinStr = scan.nextLine();
		if (isPalindrome(palinStr)) {
			System.out.println("Yes its a palinrome");
		} else {
			System.out.println("No String is not a palindrome");
		}
		String str = "dabcba";
		String longestPalin = Palindrome.longestPalindromeDP(str);
		System.out.println("Longest palindrome " + longestPalin);
	}

}
