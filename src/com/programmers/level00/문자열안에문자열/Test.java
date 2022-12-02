package com.programmers.level00.문자열안에문자열;
// 문자열 str1, str2가 매개변수로 주어집니다. 
// str1 안에 str2가 있다면 1을 없다면 2를 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		solution("ppprrrogrammers", "pppp");//2
		solution("ab6CDE443fgh22iJKlmn1o", "6CD");//1
		
		System.out.println(solution("ppprrrogrammers", "pppp"));
		System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD"));
	}

	static int solution(String str1, String str2) {
		int answer = 0;
		if (str1.contains(str2)) {
			answer =1;
		}else {
			answer =2;
		}
		return answer;
	}
}

//		String [] strArr1 = new String[str1.length()];
//		String [] strArr2 = new String [str2.length()];
//		
//		for (int i = 0; i < str1.length(); i++) {
//			strArr1[i] += str1.split("");
//		}
//		for (int i = 0; i <  str2.length(); i++) {
//			strArr2[i] += str1.split("");
//		}