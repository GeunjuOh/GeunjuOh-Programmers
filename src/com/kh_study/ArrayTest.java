package com.kh_study;

import java.util.ArrayList;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {
		List <String> studyMember = new ArrayList<String>();
		
		studyMember.add("오근주");
		studyMember.add("오수형");
		studyMember.add("주종선");
		studyMember.add("오바다");
		
		String name;
		
		name = studyMember.get(3);
		studyMember.remove(3);
		
		System.out.println(name);
		System.out.println(studyMember);
		System.out.println("총 멤버는? "+studyMember.size());
	}

}
