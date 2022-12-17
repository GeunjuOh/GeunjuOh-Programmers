package com.programmers.level00.영어가싫어요;

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("onetwothreefourfivesixseveneightnine"));// 123456789
	}

	static long solution(String numbers) {
		long answer = 0;
		String[] num = new String[] { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		// String str = "";
		String[] strNum = new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		for (int i = 0; i < strNum.length; i++) {
			numbers = numbers.replaceAll(num[i], strNum[i]);
		}
		System.out.println(numbers);
		answer = Long.parseLong(numbers);
		return answer;
	}
}

//			이렇게도 가능!
//			String[] intNum = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//	        str = numbers.replaceAll(num[i], intNum[i]);