package main.level1.p12912;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long result1 = sol.solution(3, 5);
		long result2 = sol.solution(3, 3);
		long result3 = sol.solution(5, 3);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}
class Solution {
	public long solution(int a, int b) {
		long answer = 0;
		if(a < b) {
			for(int i = a; i <= b; i++)
				answer += i;
		} else if (a > b) {
			for (int i = b ; i <= a; i++)
				answer += i;
		} else
			answer = a;

		return answer;
	}
}