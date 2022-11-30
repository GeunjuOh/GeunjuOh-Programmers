package com.programmers.level00.짝수홀수개수;

/*  정수가 담긴 리스트 num_list가 주어질 때,
 *  num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 
 *  return 하도록 solution 함수를 완성해보세요.
 * */
public class Test {
	public static void main(String[] args) {
		solution(new int[] { 1, 2, 3, 4, 5}); // 
		System.out.println(solution(new int[] { 1, 2, 3, 4, 5}));
	}
	static int[] solution(int[] num_list) {
		// 담을 answer 정수 리스트
		int[] answer = new int[2];
		int c1 =0;
		int c2 =0;
		
		//반복문으로 짝수인지 확인하기
		for (int i = 0; i < num_list.length; i++) {
			if(num_list[i]%2==0)
				c1++;
			else {
				c2++;
			}
		}
		//0번째에는 짝수 return, 1번째에는 홀수 return
		answer[0] = c1;
		answer[1] = c2;
		//결과값
		return answer;
		
	}		
}