package main.level1.p12944;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		double result = sol.solution(new int[]{1,2,3,4});
		System.out.println(result);
	}
}
class Solution {
	public double solution(int[] arr) {
		double sum = 0;
		for (int x : arr)
			sum += x;
		return sum / arr.length;
	}
}