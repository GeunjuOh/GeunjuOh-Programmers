package com.programmers.level00.대문자와소문자;

//문자열 my_string이 매개변수로 주어질 때, 대문자는 소문자로 소문자는 대문자로 변환한 문자열을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		solution("cccCCC");
		System.out.println(solution("cccCCC"));// "CCCccc"
		System.out.println(solution("abCdEfghIJ"));// "ABcDeFGHij"

	}

	static String solution(String my_string) {
		String answer = "";
		char[] ch = my_string.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] < 97) {
				ch[i] = Character.toLowerCase(ch[i]);
			} else {
				ch[i] = Character.toUpperCase(ch[i]);
			}
		}
		return answer = String.valueOf(ch);
	}
}
