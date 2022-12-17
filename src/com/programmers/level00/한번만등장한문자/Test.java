package com.programmers.level00.한번만등장한문자;

import java.util.Arrays;

/* 문자열 s가 매개변수로 주어집니다.
 * s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록 solution 함수를 완성해보세요. 
 * 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 * s는 소문자로만 이루어져 있습니다.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution("abcabcadc"));// d
		System.out.println(solution("abdc"));// "abcd"
		System.out.println(solution("hello"));// "eho" 한번만 나오는 문자열 사전순으로 정렬
	}

	static String solution(String s) {
		String answer = "";
//         무조건 정렬
//        한번만 등장하는지 ? equals
//        모든 문자가 한 번씩 등장하므로 사전 순으로 정렬한 "abcd"를 return 합니다.
//        한 번씩 등장한 문자는 "heo"이고 이를 사전 순으로 정렬한 "eho"를 return 합니다.
//        한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
//		String temp = "";
		String[] strArr = s.split("");
		Arrays.sort(strArr);
		StringBuilder sb = new StringBuilder();
		//StringBuilder로 생성되는 쓰레기 최소화함.
		
		for (int i = 0; i < strArr.length; i++) {
			if(s.indexOf(strArr[i])==s.lastIndexOf(strArr[i]))
				sb.append(strArr[i]);
		}
		return answer +=sb;
	}
}


/*
 * String[] sarr= s.split();
 * StringBilder sb  enw stromgbil();
 * for
 * if(s.indexof(strarrr[i] ==s.lastIndex(StrARr[i]
 * sb.append(strArr[i]
 * 
 * */


