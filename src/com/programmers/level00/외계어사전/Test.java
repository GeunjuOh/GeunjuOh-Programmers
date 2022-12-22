package com.programmers.level00.외계어사전;

import java.util.Arrays;

//PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는 외계행성의 언어를 공부하려고 합니다. 알파벳이 담긴 배열 spell과 외계어 사전 dic이 매개변수로 주어집니다. 
//spell에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic에 존재한다면 1, 존재하지 않는다면 2를 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(
				solution(new String[] { "p", "o", "s" }, new String[] { "sod", "eocd", "qixm", "adio", "soo" }));
		System.out.println(solution(new String[] { "z", "d", "x" }, new String[] { "def", "dww", "dzx", "loveaw" }));
	}

	static int solution(String[] spell, String[] dic) {
		// 처음 들어오는 spell sort 하기
		Arrays.sort(spell);
		// 저장한 문자열과 동일한 것을 담고있는지 확인
		for (int i = 0; i < dic.length; i++) {
			// for문 안에서 String 배열 생성 후
			// i가 계속 돌면서 배열을 바꿀 예정
			String[] strArr = dic[i].split("");
			Arrays.sort(strArr);
			if (Arrays.equals(strArr, spell))
				// 동일하면 1, 아니면2 리턴
				return 1;
		}
		return 2;
	}
}
