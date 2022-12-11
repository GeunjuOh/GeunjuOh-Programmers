package com.programmers.level00.A로B만들기;

import java.util.Arrays;

/*문자열 before와 after가 매개변수로 주어질 때,
 *before의 순서를 바꾸어 after를 만들 수 있으면 1을, 만들 수 없으면 0을 return 하도록 solution 함수를 완성해보세요.*/
public class Test {

	public static void main(String[] args) {
		System.out.println(solution("olleh", "hello")); // 1
		System.out.println(solution("allpe", "apple")); // 0
	}

	static int solution(String before, String after) {
		int answer = 0;
//		if(순서 바꾼 값이.equals(after))return answer =1;
//		else return answer0;
//		이중 for문을 써도 맞지만, 
//		문자열만 같은 문자열이 있다면 같은 문자열을 만들 수 있다는 소리!

		String[] beforArr = before.split("");
		// [o l l e h]
//		    0 1 2 3 4
		String[] afterArr = after.split("");

		Arrays.sort(beforArr);
		Arrays.sort(afterArr);
		String strinA = "";
		String strinB = "";

		for (int i = 0; i < afterArr.length; i++) {
			strinA += afterArr[i];
			strinB += beforArr[i];
		}
		if (strinA.equals(strinB))
			return answer = 1;
		else
			return answer = 0;
	}
}

/*
 * 단순히 배열만 바꾼것 for (int i = 0; i <= str.length - 1; i++) { temp += str[num - i];
 * // [ ] }
 */
