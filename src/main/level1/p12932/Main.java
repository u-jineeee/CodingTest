package main.level1.p12932;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] result = sol.solution(12345);
		System.out.println(Arrays.toString(result));
	}
}
class Solution {
	public int[] solution(long n) {
		int[] answer = new int[String.valueOf(n).length()];

		for(long i = 0; i < answer.length; i++){
			long x = n % 10;
			answer[(int)i] = (int)x;
			n = n / 10;
		}
		return answer;
	}
}