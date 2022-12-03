package com.programmers.level00.숨어있는숫자의덧셈;

public class Test {
// 문자열 my_string이 매개변수로 주어집니다. my_string안의 모든 자연수들의 합을 return하도록 solution 함수를 완성해주세요.

	public static void main(String[] args) {
//		solution("1a2b3c4d123"); // 16
		System.out.println(solution("1a2b3c4d123")); // 16
		System.out.println(solution("aAb1B2cC34oOp")); // 10
	}

	static int solution(String my_string) {
		int answer = 0;
		String replace = "";
//		받는 문자열 중 숫자만 따로 분리 필요! 영문을 모두 소문자로 변경 후 알파벳 삭제
//		문자열을 하나 하나 숫자로 담을 공간 필요

		replace = my_string.toLowerCase().replaceAll("[abcdefghijklmnopqrstuvwxyz]", "");
		String[] strArr = replace.split("");

		for (int i = 0; i < strArr.length; i++) {
			answer += Integer.parseInt(strArr[i]);
		}
		return answer;
	}
}
