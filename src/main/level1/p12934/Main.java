package main.level1.p12934;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		long result = sol.solution(121);
		System.out.println(144);
	}
}
class Solution {
	public long solution(long n) {
		long x = (long)Math.sqrt(n);

		if(x * x == n)
			return (x + 1) * (x + 1);
		else
			return -1;
	}
}