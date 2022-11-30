package com.programmers.level00.배열뒤집기;

/*  정수가 들어 있는 배열 num_list가 매개변수로 주어집니다.
 *  num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 * */

public class Test {

	public static void main(String[] args) {
//		실행문을 모르겠음
		int[] arr = {1, 2, 100, -99, 1, 2, 3};
		solution(arr);
		
	}
	
	static void solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i=num_list.length-1, j=0; i>=0; i--,j++)
        	answer[j] = num_list[i];
        for(int n : num_list)System.out.print(n+" ");
	}
	
}
