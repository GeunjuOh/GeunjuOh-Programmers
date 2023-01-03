package com.programmers.level00.연속된수의합;

//연속된 세 개의 정수를 더해 12가 되는 경우는 3, 4, 5입니다. 두 정수 num과 total이 주어집니다. 
//연속된 수 num개를 더한 값이 total이 될 때, 정수 배열을 오름차순으로 담아 return하도록 solution함수를 완성해보세요.
public class Test {
	public static void main(String[] args) {
		System.out.println(solution(3, 12));// [3, 4, 5]
		System.out.println(solution(5, 15));// [1, 2, 3, 4, 5]
	}

	static int[] solution(int num, int total) {
        // 연속된 정수
        // ex) num = 5, total = 15
        // 연속된 정수 5개를 모두 더했을 때 15가 되는 정수들을 오름차순으로 배열에 담기
        // num이 5일때
		// x + x+1 + x+2 + x+3 + x+4 = 15
        // 5*x + (1+2+3+4) = 15  / num * x + (1+2+3+.....+num-1) = total
        // 5x = 15-10=5
        // x = 1
        int[] answer = new int[num];
        
        int xNum = 0; // 1부터 num-1 까지 모두 더한 숫자
        //x + x+1 + x+2 + x+3 + x+4... 1부터 곱해야하는 수를 모두 모아 더함.
        
        for(int i = 1; i < num; i++){ // 1부터 num-1까지 모두 더하기
            xNum+=i;                  // 공식있음 : (num*(num+1))/2 = xNum
        }
        
        int x = (total - xNum) / num; // 연속되는 숫자 중 맨 처음 숫자
        // 1+2+3+4 다 더한 값에서 =10 이제 ttl 값 15를 빼면 5/5 =1
        
        for(int i = 0; i < num; i++){ // 정답 배열에 숫자 x부터 1씩 증가한 값 더한값 넣어주기
            answer[i] = x + i;        // answer = [1,1+1,1+2,1+3,1+4]
        }
        
        return answer;
    }
}
