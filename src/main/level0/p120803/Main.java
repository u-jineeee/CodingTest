package main.level0.p120803;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result = sol.solution(2, 3);
		System.out.println(result);
	}
}
class Solution {
	public int solution(int num1, int num2) {
		int answer = num1 - num2;
		return answer;
	}
}