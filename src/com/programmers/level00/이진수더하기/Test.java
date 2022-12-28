package com.programmers.level00.이진수더하기;
//이진수를 의미하는 두 개의 문자열 bin1과 bin2가 매개변수로 주어질 때, 

//두 이진수의 합을 return하도록 solution 함수를 완성해주세요.

import java.math.BigInteger;

public class Test {

	public static void main(String[] args) {
		System.out.println(solution("10", "11"));// "101"
		System.out.println(solution("1001", "1111"));// "11000"
	}

	static String solution(String bin1, String bin2) {
		String answer = "";
		int result = Integer.valueOf(bin1, 2) + Integer.valueOf(bin2, 2);

		// BigInteger 형변환 하면서 10진수로 바꿔준다.(A, 2)가 10진수로 바꾸는 방법
		BigInteger bin1_binary = new BigInteger(bin1, 2);
		BigInteger bin2_binary = new BigInteger(bin2, 2);

		// 합 연산식(add)로 더해서 변수에 저장.
		BigInteger sum = bin1_binary.add(bin2_binary);

		// 풀이방식에 적어둔 대로 2진수로 변환
		String sum_binary = sum.toString(2);

		return sum_binary;
//		System.out.println(sum_binary);
	}
}
