package main.level1.p86051;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = sol.solution(new int[]{1,2,3,4,6,7,8,0});
		System.out.println(14);
	}
}
class Solution {
	public int solution(int[] numbers) {
		int answer = 45;
		for(int n : numbers)
			answer -= n;

		return answer;
	}
}