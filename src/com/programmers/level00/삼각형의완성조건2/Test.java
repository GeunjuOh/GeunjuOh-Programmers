package com.programmers.level00.삼각형의완성조건2;

/*선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.
 가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
 삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 
 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2 })); // 1;
		System.out.println(solution(new int[] { 11, 7 })); // 13;
	}

	static int solution(int[] sides) {
		// {11,7} 두변의 길이가 들어온다고 가정
		// 두변의 길이 중 가장 큰 값 찾기
		int bigValue = Math.max(sides[0], sides[1]);
		// 작은 길이 찾기
		int smallValue = Math.min(sides[0], sides[1]);

		// 긴변 - 작은변 => 11-7 = 4
		int lowLimit = bigValue - smallValue;
		// 가장 큰변이 올수 있는 길이는? 11+4 = 18
		int highLimit = bigValue + smallValue;
		// 길이가 될수 있는 총 수 =>18-4-1 = 13
		return highLimit - lowLimit - 1;
	}
}
