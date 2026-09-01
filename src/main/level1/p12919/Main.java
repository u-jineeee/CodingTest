package main.level1.p12919;

import java.util.Objects;

public class Main {
	public static void main(String[] args) {

	}
}
class Solution {
	public String solution(String[] seoul) {
		int n = 0;
		for(int i = 0; i < seoul.length; i++) {
			if(seoul[i].equals("Kim"))
				n = i;
		}
		return "김서방은 " + n + "에 있다";
	}
}