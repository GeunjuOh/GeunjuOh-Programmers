package com.programmers.level00.k의개수;

/*1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다. 
 * 정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.*/
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(1, 13, 1));// 6
//		1,2,3,4,---10,11,12,13
		System.out.println(solution(1, 13, 1));// 6
		System.out.println(solution(10, 50, 5));// 5
		System.out.println(solution(3, 10, 2));// 0

	}

	static int solution(int i, int j, int k) {
		int answer = 0;
		int sum = 0;
		String sSum = "";

		for (int l = j; l >= i; l--) {
			sSum += String.valueOf(l);
		}
		String[] strArr = sSum.split("");

		for (int l = 0; l < strArr.length; l++) {
			if (strArr[l].contains(String.valueOf(k))) {
				answer++;
			}
		}
		return answer;
	}
}
