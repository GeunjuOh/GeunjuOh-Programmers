package com.programmers.level00.최댓값만들기2;

//정수 배열 numbers가 매개변수로 주어집니다. 
//numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, -3, 4, -5 })); // 15

	}

	static int solution(int[] numbers) {
		int answer = 0;

		Arrays.sort(numbers);
		// -5,-3,1,2,4
		// 만들 수 있는 최댓값을 return

		int num1 = numbers[0] * numbers[1];
		int num2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

		if (num1 < num2) {
			answer = numbers[numbers.length - 1] * numbers[numbers.length - 2];
		} else {
			answer = numbers[0] * numbers[1];
		}
		return answer;
	}
}
