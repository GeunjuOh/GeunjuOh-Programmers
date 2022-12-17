package com.programmers.level00.칠의개수;
//머쓱이는 행운의 숫자 7을 가장 좋아합니다. 정수 배열 array가 매개변수로 주어질 때, 7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[] {7, 77, 17}));//4
	}
    static int solution(int[] array) {
        int answer = 0;
        String str ="";
        
        for (int i = 0; i < array.length; i++) {
			str+=array[i];
		}
        String[] strArr = str.split("");
        
        for (int i = 0; i < strArr.length; i++) {
			if(strArr[i].equals("7"))
				answer++;
		}
        return answer;
    }
}
