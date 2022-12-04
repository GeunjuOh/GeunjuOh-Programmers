package com.programmers.level00.세균증식;

/* 어떤 세균은 1시간에 두배만큼 증식한다고 합니다.
 * 처음 세균의 마리수 n과 경과한 시간 t가 매개변수로 주어질 때
 * t시간 후 세균의 수를 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		solution(2, 10); //2048
		System.out.println(solution(2, 10));
	}

	static int solution(int n, int t) {
		int answer = 0;
		for (int i = 1; i <= t; i++) {
			n*=2;
		}
		return answer=n;
	}
}
