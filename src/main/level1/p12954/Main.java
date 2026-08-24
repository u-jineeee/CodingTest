package main.level1.p12954;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long[] result = sol.solution(2, 5);
		System.out.println(Arrays.toString(result));
	}
}
class Solution {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		for(int i = 1; i <= n; i++)
			answer[i-1] = (long)x * i;
		return answer;
	}
}