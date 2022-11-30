package com.programmers.level00.몫구하기;

	
//	 	나누기
	public class Solution {
		int solution(int num1, int num2) {
        return num1/num2;
	}
	 
		
//	 	덧샘
	 public int solutionPlus(int num1, int num2) {
		 int answer = 0;
		 if(num1<=50000 && num2<=50000 && num1>=-50000 && num2>=-50000) {
		 answer= num1+num2; 
		 }
		 return answer;
    }
		
	 
//	 	뺄샘
	 public int solution1(int num1, int num2) {
		 int answer = 0;
		 answer= num1-num2; 
		 return answer;
    }
//	 	몫 구하기
	    public int solution2(int num1, int num2) {
	        int answer = 0;
	        answer = num1%num2;
	        return answer;
	    }
	    
//	    나이 구하기
	    public int solution3(int age) {
	        int answer = 0;
	        int fixedYear = 2022;
	        int setYear =0;
	        
	        if(age<=120 && age>0){
	            setYear= fixedYear-age;
	            answer = setYear+1;         
	        }else{
	            System.out.print("Error");
	        }
	        return answer;
	    }
	    
//	 	나누기 *1000
	    public int solution4(int num1, int num2) {
	    	return (int)(((float) num1/num2)*1000);
	    }	    
}
