package com.programmers.level00.삼육구게임;

//머쓱이는 친구들과 369게임을 하고 있습니다. 369게임은 1부터 숫자를 하나씩 대며 
//3, 6, 9가 들어가는 숫자는 숫자 대신 3, 6, 9의 개수만큼 박수를 치는 게임입니다.
//머쓱이가 말해야하는 숫자 order가 매개변수로 주어질 때, 머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(3));// 1
		System.out.println(solution(29423));// 2
	}

	static int solution(int order) {
		int answer = 0;
		String[] strArr = ("" + order).split("");
		for (int i = 0; i < strArr.length; i++) {
			if (strArr[i].equals("3") | strArr[i].equals("6") | strArr[i].equals("9"))
				answer++;
		}
		return answer;
	}
}

/*
 * <첫번째 풀이> 3의 배수를 저장할 수 있는곳 // 그리고 그 3의 배수가 나온다면 answer++
 * 
 * int answer = 0; String str = String.valueOf(order); // str : 29423 String[]
 * strArr = str.split("");
 * 
 * int[] intArr = new int[strArr.length]; for (int i = 0; i < strArr.length;
 * i++) { intArr[i] = Integer.parseInt(strArr[i]); // intArr : [2, 9, 4, 2, 3]
 * // 만약에 3을로 나눈 나머지가 1 일때마다 answer++ if (intArr[i] % 3 == 0) answer++; } return
 * answer; } }
 */
