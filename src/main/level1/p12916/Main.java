package main.level1.p12916;

public class Main {
	public static void main(String[] args) {
		Solution sol = new Solution();
		boolean result = sol.solution("pPoooyY");
		System.out.println(result);
	}
}
class Solution {
	boolean solution(String s) {
		int p = 0, y = 0;

		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'p')
				p++;
			else if(s.charAt(i) == 'y')
				y++;
		}

		return p == y;
	}
}