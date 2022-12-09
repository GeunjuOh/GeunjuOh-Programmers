package com.programmers.level00.중복된문자제거;
//문자열 my_string이 매개변수로 주어집니다.

//my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.
///공백(" ")도 하나의 문자로 구분합니다.
//중복된 문자 중 가장 앞에 있는 문자를 남깁니다.

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("people"));// "peol"
	}

	static String solution(String my_string) {
		String answer = "";
		// indexOf() : Returns the index within this string of the first occurrence of
		// contains(StringvalueOf()) : char 배열을 String에 넣기 위해 StringvalueOf를 사용!

		// 1. 우선 char 배열에 하나씩 다 담는다.
		char[] cArray = my_string.toCharArray();

		// 2. 하나씩 돌면서 contains 되어있는지 체크하고 없으면 answer에 담기!
		for (char c : cArray) {
			if (!answer.contains(String.valueOf(c)))
				answer = answer + c;
		}
		return answer;
	}
}
