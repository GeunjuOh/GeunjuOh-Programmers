package com.programmers.level00.등수매기기;
import java.util.Arrays;
/* 영어 점수와 수학 점수의 평균 점수를 기준으로 학생들의 등수를 매기려고 합니다. 
 * 영어 점수와 수학 점수를 담은 2차원 정수 배열 score가 주어질 때, 
 * 영어 점수와 수학 점수의 평균을 기준으로 매긴 등수를 담은 배열을 return하도록 solution 함수를 완성해주세요.*/
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(new int[][] { { 80, 70 }, { 90, 50 }, { 40, 70 }, { 50, 80 } }));
		// [1, 2, 4, 3] 								75 		70 			55 			65
	}

	static int[] solution(int[][] score) {
		int[] answer = new int[score.length];
//		/{{80, 70}, {90, 50}, {40, 70}, {50, 80}}
//		1. 각[i]번째중 [0]+[1]/2를 해야함 >> 아니다 그냥 두합이 더 크면 1위! 
//		2. 그거를 처음에 배열에 점수를 전체 담고 
//		3. 숫자를 비교해서 작으면 하나씩 -1 을 하는 것이다.
//		4. 이때 사용하는 것이 Arrays.fill(answer, score.length);	
		
		Arrays.fill(answer, score.length);	
		//score의 길이만큼 answer의 값이 채워지게 됩니다. 
		//예) answer = [150,150,150,150]
		
		for (int i = 0; i < score.length; i++) {
			for(int j = 0; j<score.length;j++) {
				if(i!=j && score[i][0]+score[i][1] >= score[j][0]+score[j][1]) 
				answer[i]--;
			}
			}
		for (int k : answer) {
			System.out.print(k);
		}
		return answer;
	}
}

/*  첫 오답
	for(int i = 0; i<score.length;i++) {
		for(int j = 0; j<score.length;j++) {
			int ex_sum = score[i][0]+score[i][1]; // 2차원 배열의 값을 꺼내서 총합을 구한다
			if(i!=j&&score[i][0]+score[i][1]>=score[j][0]+score[j][1]) answer[i]--;
		}
	}
        return answer;
    }
}*/
