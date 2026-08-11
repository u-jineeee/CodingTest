package main.level1.p12931;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		int result1 = sol.solution(123);
		System.out.println(result1);
	}
}
class Solution {
	public int solution(int n) {
		int answer = 0;
		while(n > 0) {
			int r = n % 10;
			answer += r;
			n = n / 10;
		}
		return answer;
	}
}
