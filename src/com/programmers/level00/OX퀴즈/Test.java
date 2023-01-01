package com.programmers.level00.OX퀴즈;

//덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다. 
//수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new String[] { "3 - 4 = -3", "5 + 6 = 11" })); // ["X", "O"]
		System.out.println(solution(new String[] { "19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2" })); // ["O", "O", "X", "O"]
	}

	static String[] solution(String[] quiz) {
		String[] answer = new String[quiz.length];
		String[] temp = new String[quiz.length];

		// 숫자 10이상인 수가 있을 수 있으니, " "으로 나눠서 문자열에 저장
		for (int i = 0; i < quiz.length; i++) {
			temp = quiz[i].split(" ");
		// 마이너스 일때
		if(temp[1].equals("-")) {
			if(Integer.parseInt(temp[0])-Integer.parseInt(temp[2])==Integer.parseInt(temp[4])) {
				answer[i]="O";
			}
			else {
				answer[i]="X";
			}
		}
		if(temp[1].equals("+")) {
			if(Integer.parseInt(temp[0])+Integer.parseInt(temp[2])==Integer.parseInt(temp[4])) {
				answer[i]="O";
			}else {
				answer[i]="X";
			}	
		}
	}
		for (String string : answer) {
			System.out.println(string);
		}
		return answer;
	}
}