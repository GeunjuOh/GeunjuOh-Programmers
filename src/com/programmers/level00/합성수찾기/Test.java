package com.programmers.level00.합성수찾기;

//약수의 개수가 세 개 이상인 수를 합성수라고 합니다. 
//자연수 n이 매개변수로 주어질 때 n이하의 합성수의 개수를 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		solution(10);
		System.out.println(solution(10));// 5
		System.out.println(solution(15));// 8
	}

	static int div(int n) {
		int count = 0;
//		매개변수 n으로 들어온 정수의 약수 개수를 구하는 메소드
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count;
	}

	static int solution(int n) {
		int answer = 0;
//		약수의 개수가 2가 아니거나, n이 1이 아니면 answer +1함.
//		왜냐면 1은 필요 없고 약수가 2개가 아니면 3개니까 이게 정답 구하는거임
		for (int i = 1; i <= n; i++) {
			if (div(i) != 2 && div(i) != 1)
				answer++;
		}
		return answer;
	}
}
