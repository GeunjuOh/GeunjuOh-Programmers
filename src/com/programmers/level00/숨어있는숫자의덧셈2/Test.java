package com.programmers.level00.숨어있는숫자의덧셈2;

//문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. 
//my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution("aAb1B2cC34oOp"));// 37
		// "aAb1B2cC34oOp"안의 자연수는 1, 2, 34 입니다. 따라서 1 + 2 + 34 = 37 을 return합니다.
	}

	static int solution(String my_string) {
		int answer = 0;
		// "aAb1B2cC34oOp"

		// 한칸씩 공백을 만든 후 영문자 제거
		String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
		// " 1 2 34 "

		for (String s : str) {
			if (!s.equals("")) {
				// 공백이 없는 숫자의 값만 가져와서 answer에 더함.
				answer += Integer.parseInt(s);
			}
		}
		return answer;
	}
}