package main.level1.p76501;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = sol.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true});
		System.out.println(result);
	}
}
class Solution {
	public int solution(int[] absolutes, boolean[] signs) {
		int sum = 0;
		for(int i = 0; i < absolutes.length; i++) {
			if (signs[i])
				sum += absolutes[i];
			else
				sum -= absolutes[i];
		}
		return sum;
	}
}