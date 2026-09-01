package main.level1.p12910;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {

	}
}
class Solution {
	public int[] solution(int[] arr, int divisor) {
		List<Integer> list = new ArrayList<>();
		for(int n : arr) {
			if(n % divisor == 0)
				list.add(n);
		}
		if(list.size() == 0)
			return new int[] {-1};

		Collections.sort(list);
		return list.stream().mapToInt(i -> i).toArray();
	}
}