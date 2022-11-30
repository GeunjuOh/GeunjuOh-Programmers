package com.programmers.level00.배열원소의길이;
/*
 * 문자열 배열 strlist가 매개변수로 주어집니다. strlist 각 원소의 길이를 담은 배열을 retrun하도록 solution 함수를
 * 완성해주세요.
 */

public class Test {


	public static void main(String[] args) {
		
		solution(new String[] {"I", "Love", "Programmers."});
//		System.out.println(solution(new String[] {"I", "Love", "Programmers."}));
	}
//	}

	static int[] solution(String[] strlist) {
		int[] answer = new int [strlist.length] ;

		int length = strlist.length;
		// 각 배열의 요소를 for로 출력
		for (int i = 0; i < length; i++) {
			answer[i] = strlist[i].length();
			System.out.println(answer[i]);		//이걸 써야지 출력문이 나옴!!!
		}
		// 그 출력한 값을 숫자로 몇개인지 answer 에 담기.
		// 요소 3,4,5;
		return answer;
	}
}