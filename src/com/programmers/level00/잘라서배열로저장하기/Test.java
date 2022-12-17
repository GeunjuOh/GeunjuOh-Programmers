package com.programmers.level00.잘라서배열로저장하기;

//문자열 my_str과 n이 매개변수로 주어질 때, my_str을 길이 n씩 잘라서 저장한 배열을 return하도록 solution 함수를 완성해주세요.
//my_str은 알파벳 소문자, 대문자, 숫자로 이루어져 있습니다.
//입출력 예 #1의 경우 "abc1Addfggg4556b"를 길이 6씩 자르면 "abc1Ad", "dfggg4" 두개와 마지막 "556b"가 남습니다. 이런 경우 남은 문자열을 그대로 배열에 저장합니

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("abc1Addfggg4556b", 6)); // ["abc1Ad", "dfggg4", "556b"]
		System.out.println(solution("abcdef123", 3)); // ["abc", "def", "123"]
	}

	static String[] solution(String my_str, int n) {

		int length = my_str.length() % n == 0 ? my_str.length() / n : my_str.length() / n + 1;
		int startIndex = 0;
		int endIndex = n;
		String[] answer = new String[length];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = my_str.substring(startIndex, endIndex);
			startIndex += n;
			endIndex = (endIndex + n) > my_str.length() ? my_str.length() : endIndex + n;
		}
		return answer;
	}
}
//		for (String string : answer) {
//			System.out.print(string + ",");	}