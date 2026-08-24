package main.level1.p12933;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long result = sol.solution(118372);
		System.out.println(result);
	}
}
class Solution {
	public long solution(long n) {
		char[] chars = String.valueOf(n).toCharArray();
		Arrays.sort(chars);

		StringBuilder sb = new StringBuilder(new String(chars)).reverse();
		return Long.parseLong(sb.toString());
	}
}