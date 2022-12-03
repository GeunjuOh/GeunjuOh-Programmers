package com.programmers.level00.옷가게할인받기;
/*	머쓱이네 옷가게는 10만원 이상 사면 5%,
 *  			  30만원 이상 사면 10%,
 *  			  50만 원 이상 사면 20%를 할인해줍니다.
 *	구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * */
public class Test {

	public static void main(String[] args) {
		System.out.println(solution(150000));//142,500
		System.out.println(solution(580000));//464,000
	}

	
    static int solution(int price) {
        double answer = 0;
        
        if(price>=500000) {
        	answer = (price*0.8);		// 원래는 가격 = 가격* 할인율 ( 할인된 가격 = 만원 * 0.2) 20프로 할인인데 이거를 1-0.2 해서 0.8을 곱한다.
        }else if(price>=300000) {
        	answer = (price*0.9);	//10프로 할인
        }else if(price>=100000) {
        	answer = (price*0.95);	//5프로 할일 		0.95 = ( 1 - 0.05)
        }
        return (int)answer;
    }
}
