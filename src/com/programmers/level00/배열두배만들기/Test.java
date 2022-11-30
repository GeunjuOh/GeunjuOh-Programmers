package com.programmers.level00.배열두배만들기;

/* 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 각 원소에 두배한 원소를 가진 배열을 
 * return하도록 solution 함수를 완성해주세요.
 * */

public class Test {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 100, -99, 1, 2, 3 };
		solution(arr);

	}

	static int[] solution(int[] numbers) {

		for (int i = 0; i < numbers.length; i++)
			numbers[i] = numbers[i] * 2;
			return numbers;
				
//			for (int i : numbers) {
//				System.out.print(i);}
	
	}
}
