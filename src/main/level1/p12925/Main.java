package main.level1.p12925;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result1 = sol.solution("-1234");
		int result2 = sol.solution("1234");
		System.out.println(result1);
		System.out.println(result2);
	}
}
class Solution {
	public int solution(String s) {
		return Integer.parseInt(s);
	}
}