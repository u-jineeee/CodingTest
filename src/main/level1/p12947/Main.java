package main.level1.p12947;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean result = sol.solution(10);
		System.out.println(result);
	}
}
class Solution {
	public boolean solution(int x) {
		int sum = 0;
		int n = x;
		while(x > 0){
			sum += x % 10;
			x /= 10;
		}

		return n % sum == 0;
	}
}