package com.programmers.level00.최댓값만들기;

import java.util.Arrays;

/* 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		solution(new int [] {0, 31, 24, 10, 1, 9});
		System.out.println(solution(new int [] {0, 31, 24, 10, 1, 9}));
	}

	static int solution(int[] numbers) {
        int answer ;
        //최댓값 담을 변수
        //{0, 31, 24, 10, 1, 9}
        //{0, 1 , 9, 10, 24, 31}

        //sort로 정렬 후 마지막 배열끼리 곱하기
        Arrays.sort(numbers);
        
        //만들 수 있는 최댓값을 return
        answer =(numbers[numbers.length-1]) * (numbers[numbers.length-2]);
        return answer;
	
	}	
	
}
