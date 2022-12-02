package com.programmers.level00.제곱수판별하기;

/*  어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
 *  정수 n이 매개변수로 주어질 때, n이 제곱수라면 1을 아니라면 2를 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		solution(144);
		System.out.println(solution(144)); // 1
		System.out.println(solution(976)); // 2

	}

	static int solution(int n) {
		int answer = 0;
		double result = 0;
//	        Math.pow => 거듭제곱 구하기
//	        Math.sqrt => 제곱근 루트 구하기
//	        n이 제곱수라면 1을 아니라면 2를 return??

		result = Math.sqrt(n);
		if (n % result == 0) {
			return answer = 1;
		} else {
			return answer = 2;
		}
	}
}
