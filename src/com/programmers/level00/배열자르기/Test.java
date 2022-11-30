package com.programmers.level00.배열자르기;

import java.util.Arrays;

/* 정수 배열 numbers와 정수 num1, num2가 매개변수로 주어질 때, 
 * numbers의 num1번 째 인덱스부터 num2번째 인덱스까지 자른 정수 배열을 
 * return 하도록 solution 함수를 완성해보세요.
 * */

public class Test {

	public static void main(String[] args) {
	int[] numbers = new int[] {1,2,3,4,5,6,7};
	solution(numbers, 2, 4); //3,4
	}

	static int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = Arrays.copyOfRange(numbers, num1, num2+1);
       
        return answer;
    }
	
	
	
	
	
}
