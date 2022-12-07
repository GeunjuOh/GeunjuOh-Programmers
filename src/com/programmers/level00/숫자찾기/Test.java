package com.programmers.level00.숫자찾기;
//정수 num과 k가 매개변수로 주어질 때,

//num을 이루는 숫자 중에 k가 있으면 num의 그 숫자가 있는 자리 수를 return하고 없으면 -1을 return 하도록 solution 함수를 완성해보세요.
//num에 k가 여러 개 있으면 가장 처음 나타나는 자리를 return 합니다.

public class Test {

	public static void main(String[] args) {
		solution(29183, 1);
		System.out.println(solution(29183, 1));// 3
		System.out.println(solution(232443, 4));// 4
		System.out.println(solution(123456, 7));// -1
	}

	static public int solution(int num, int k) {
		int answer = 0;
		
		String str ="";
		str= String.valueOf(num);  //29183;
		String[] strArr = str.split(""); //[2,9,1,8,3];		
		int [] arr = new int [strArr.length];
		
		
		for (int i = 0; i < strArr.length; i++) {
			arr[i] = Integer.parseInt(strArr[i]);
				if(k-arr[i]==0) {
					answer = i+1;
					break;
				}else {
					answer =-1;
				}
		}
		return answer;
	}
}
