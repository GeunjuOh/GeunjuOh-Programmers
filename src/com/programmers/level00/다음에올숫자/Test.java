package com.programmers.level00.다음에올숫자;

//등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 4 })); // 5
		System.out.println(solution(new int[] { 2, 4, 8 }));// 16
	}

	static int solution(int[] common) {
		// 등차수열 : 첫번째 값과 두번째 값의 차이가 두번째 값과 세번째 값의 차이가 같으면 등차
		// 그게 아니라면 두번째 값을 첫번째 값으로 나눈 값의 결과를 곱해주면 된다.
		int answer = 0;
		if ((common[1] - common[0]) == (common[2] - common[1])) {
			answer = common[common.length - 1] + (common[1] - common[0]);
		} else {
			answer = common[common.length - 1] * (common[1] / common[0]);
		}
		return answer;
	}
}
