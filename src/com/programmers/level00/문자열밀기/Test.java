package com.programmers.level00.문자열밀기;

/*문자열 "hello"에서 각 문자를 오른쪽으로 한 칸씩 밀고 마지막 문자는 맨 앞으로 이동시키면 "ohell"이 됩니다. 
 * 이것을 문자열을 민다고 정의한다면 문자열 A와 B가 매개변수로 주어질 때, 
 * A를 밀어서 B가 될 수 있다면 몇 번 밀어야 하는지 횟수를 return하고 밀어서 B가 될 수 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution("hello", "ohell")); // +1
		System.out.println(solution("apple", "elppa")); // -1

	}

	static int solution(String A, String B) {
//        1. B repeat(2번) => ohellohell
//        2. 이중에서 hello이 있는 인덱스를 반환하고 없으면 index Of는 -1 리턴 할것임

		String tempB = B.repeat(2);
		return tempB.indexOf(A);
	}
}
