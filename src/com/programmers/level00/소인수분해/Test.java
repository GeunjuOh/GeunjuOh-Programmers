package com.programmers.level00.소인수분해;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다. 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다. 
 *따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(12);// [2,3]
	}

	static int[] solution(int n) {
		// i는 2부터 n까지를 n으로 나누었을때 나머지가 0이면
		// i는 n의 약수이다.
		// 이때 n을 n / i의 몫으로 바꿔주고 다시 i를 2부터 돌리면서 다시 또 소인수분해하기
		// 그렇게 하다보면 2가 여러개 일 수 있고 3도 여러개일 수 있다.
		// Set을 만들어서 값을 넣어주면 알아서 중복된 값을 저장해주지 않는다.

		Set<Integer> set = new HashSet<>();

		int i = 2;
		int remainder = 1;
		while (true) {
			remainder = n % i;
			if (remainder == 0) {
				set.add(i);
				n = n / i;
				if (n == 1)
					break;
				i = 2;
			} else {
				i++;
			}

		}

		int[] answer = new int[set.size()];

		Iterator<Integer> iterator = set.iterator();
		i = 0;
		while (iterator.hasNext()) {
			answer[i] = iterator.next();
			i++;
		}
		Arrays.sort(answer);
		return answer;
	}
}
/*
 * StringBuilder sb = new StringBuilder(); int i = 2; //n이 1이 될 때까지 반복 while (n
 * != 1) { // i가 n의 약수이면 나누고 출력 if (n % i == 0) { n/= i; sb.append(i + "\n"); }
 * else { i++; } } System.out.print(sb);
 */