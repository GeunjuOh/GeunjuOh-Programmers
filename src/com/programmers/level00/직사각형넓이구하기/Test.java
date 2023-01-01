package com.programmers.level00.직사각형넓이구하기;

public class Test {

	public static void main(String[] args) {
		
	}

	static int solution(int[][] dots) {
		// 가장 큰 x의 값 - 가장 작은 x의 값 = 가로 길이
		int x = dots[0][0], y = dots[0][1], width = 0, height = 0;
		for (int i = 1; i < dots.length; i++) {
			if (x != dots[i][0])
				width = Math.abs(x - dots[i][0]);
			if (y != dots[i][1])
				height = Math.abs(y - dots[i][1]);
		}
		return width * height;
	}
}
