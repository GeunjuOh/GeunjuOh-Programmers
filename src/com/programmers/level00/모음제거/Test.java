package com.programmers.level00.모음제거;

import java.util.Iterator;

//영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
//문자열 my_string이 매개변수로 주어질 때 모음을 제거한 문자열을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {

		solution("\"nice to meet you\"");
		System.out.println(solution("\"nice to meet you\"")); // "nc t mt y"
	}

	static String solution(String my_string) {
		my_string=my_string.replaceAll("a", "");
		my_string=my_string.replaceAll("e", "");
		my_string=my_string.replaceAll("i", "");
		my_string=my_string.replaceAll("o", "");
		my_string=my_string.replaceAll("u", "");
			return my_string;
	}
}