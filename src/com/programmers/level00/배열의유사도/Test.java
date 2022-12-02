package com.programmers.level00.배열의유사도;

import java.util.Iterator;

/*  두 배열이 얼마나 유사한지 확인해보려고 합니다.
 *  문자열 배열 s1과 s2가 주어질 때 같은 원소의 개수를 return하도록 solution 함수를 완성해주세요.
 * */

public class Test {

	public static void main(String[] args) {
		solution(new String[] { "n", "omg" }, new String[] { "m", "dot" });

		System.out.println(solution(new String[] { "n", "omg" }, new String[] { "m", "dot" }));// 0
		System.out.println(solution(new String[] { "a", "b", "c" }, new String[] { "com", "b", "d", "p", "c" })); // 2

	}

	static int solution(String[] s1, String[] s2) {
		int answer = 0;
//	두문자열이 같은지 다른지를 확인하는 방법
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}
		}
//	같은 원소의 개수만큼 return        
		return answer;
	}
}
