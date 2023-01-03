package com.programmers.level00.최빈값구하기;
//최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때, 
//최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
public class Test {
	public static void main(String[] args) {
		System.out.println(solution(new int[] { 1, 2, 3, 3, 3, 4 }));// 3
	}

	static int solution(int[] array) {
		// 최빈값 찾기
		int answer = 0;
		int arr_max = 0;

		// array에서 가장 큰값을 arr_max에 저장
		for (int i = 0; i < array.length; i++) {
			if (array[i] > arr_max) {
				arr_max = array[i];
			}
		}
		// mode가 최대 몇번 나오는지 저장할 배열
		int[] modeCnt = new int[arr_max + 1];
		// mode 배열의 몇번째 인덱스에 최대값이 담겼는지 확인
		int modeMax = 0;

		// array를 돌면서 같은 인덱스의 숫자는 같은 modeCnt의 인덱스에 담기며
		// 하나씩 값을 증가할 예정!
		for (int i = 0; i < array.length; i++) {
			modeCnt[array[i]]++;
		}

		// 여기서 modeCnt에 담긴 수 중 최대 값을 담고 그 값의 인덱스가 answer 가 됨.
		for (int i = 0; i < modeCnt.length; i++) {
			if (modeCnt[i] > modeMax) {
				modeMax = modeCnt[i];
				answer = i;
			}
		}
		// 그렇다면! 이제 같은 수가 많이 있을때에는 어떻게 할까?
		int sameNum = 0;
		int mode = 0;
		for (int i = 0; i < modeCnt.length; i++) {
			mode++;

			if (modeCnt[i] == modeMax) {
				sameNum++;
			}
		}
		//같다면 -1 return
		if (sameNum > 1)
			answer = -1;

		return answer;
	}
}
