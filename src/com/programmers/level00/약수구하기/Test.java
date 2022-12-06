package com.programmers.level00.약수구하기;

// 정수 n이 매개변수로 주어질 때, n의 약수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {

		System.out.println(solution(24)); // [1, 2, 3, 4, 6, 8, 12, 24]

	}

	static int[] solution(int n) {
		int[] arry = new int[10000];
		int index = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				arry[index] = i;
				index++;
			}
		}
		int[] answer = new int[index];
		for (int i = 0; i < index; i++) {
			if (arry[i] != 0) {
				answer[i] = arry[i];
			}
		}
//		for (int i : answer) {
//			System.out.print(i+",");
//		}
		return answer;
	}
}
