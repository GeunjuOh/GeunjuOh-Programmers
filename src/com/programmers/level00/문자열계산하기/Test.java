package com.programmers.level00.문자열계산하기;
/* my_string은 "3 + 5"처럼 문자열로 된 수식입니다. 
 * 문자열 my_string이 매개변수로 주어질 때, 수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
 * <조건>
    연산자는 +, -만 존재합니다.
	문자열의 시작과 끝에는 공백이 없습니다.
	0으로 시작하는 숫자는 주어지지 않습니다.
 * 
 * */

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("3 + 4"));// 7
		System.out.println(solution("30 + 31"));// 61
	}

	static int solution(String my_string) {
		String[] strArr = my_string.split(" ");
		int answer = Integer.parseInt(strArr[0]);
		// 3

		for (int i = 1; i < strArr.length; i++) {
			switch (strArr[i]) {
			case "+":
				answer += Integer.parseInt(strArr[i + 1]);
				// 연잔자인 + 뒤에있는 배열을 더해라
				break;

			case "-":
				answer -= Integer.parseInt(strArr[i - 1]);
				// 연잔자인 - 뒤에있는 배열을 빼라
				break;
			}
		}
		return answer;
	}
}

/* 방법 3 => 10점 짜리 답변
public int solutiona(String my_string) {
	String[] s = my_string.split(" ");
    int oper =1;
    int answer=0;
    for(String s1 : s){
        if(s1.equals("+")|| s1.equals("-")){
            oper = s1.equals("-") ? -1:1;
        }else{
        	answer+= Integer.parseInt(s1)*oper;
        }
    }
    return answer;
}
}
*/


/*
 * 방법 2 => 실행은 되오나, 프로그래머스에서 런타임 오류
 * 
 * static int solution(String my_string) { int answer = 0; //연산자는 + 또는 - 둘중 하나임.
 * //contains 활용해서 if contains + then 더하기 연산 //공백 하나로 이루어져 있음 //"3 + 4" //3 4
 * int num1 =0; int num2 =0;
 * 
 * String[] sanswer =my_string.split(" ");
 * 
 * num1 = Integer.parseInt(sanswer[0]); num2 = Integer.parseInt(sanswer[2]);
 * 
 * if(sanswer[1].equals("+")) answer = num1+num2; else { answer = num1-num2; }
 * return answer; } }
 * 
 */
