package com.programmers.level00.옹알이1;

import java.util.Arrays;

/*머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 
 * 조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 
 * 문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "aya", "yee", "u", "maa", "wyeoo" }));
		System.out.println(solution(new String[] { "ayaye", "uuuma", "ye", "yemawoo", "ayaa" }));
	}

	static int solution(String[] babbling) {
		int answer = 0;

		String str = "";
		String[] babyTalk = { "aya", "ye", "woo", "ma" };

		for (int i = 0; i < babbling.length; i++) {
			for (int j = 0; j < babyTalk.length; j++) {
				if (babbling[i].contains(babyTalk[j]))
					babbling[i] = babbling[i].replaceAll(babyTalk[j], " ");
			}
		}
		System.out.println(Arrays.toString(babbling));

		for (int i = 0; i < babbling.length; i++) {
			babbling[i] = babbling[i].replaceAll(" ", "");
			if (babbling[i].equals(""))
				answer++;
		}
		return answer;
	}
}

/*
 * 실패한 코드 for (String bby : babyTalk) { for (int i = 0; i < babbling.length;
 * i++) { babbling[i] = babbling[i].replace(bby, " "); } } //
 * System.out.print(Arrays.toString(babbling));
 * 
 * for (int i = 0; i < babbling.length; i++) { if (babbling[i].equals(" "))
 * babbling[i] = babbling[i].replaceAll(" ", ""); } for (int j = 0; j <
 * babbling.length; j++) { if (babbling[j].equals("")) answer += 1; }
 * System.out.print(Arrays.toString(babbling));
 */