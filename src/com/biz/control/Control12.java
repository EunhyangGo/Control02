package com.biz.control;

public class Control12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 급여액이 3000이하이면 6%, 3000 초과 10000 이하이면 9%, 10000을 초과하면 12%
		
		int intPay = 3000;
		if(intPay <= 3000) {
			System.out.println("세금 :"+(intPay * 0.06));
		}
		//intPay가 10000이하 이면서 3000을 초과하면
		//int ( 10000>=intPay && 3000 < intPay)도 괜찮지만 부등호는 한쪽 방향으로 되있는것이 좋음.
		if(10000 >= intPay && intPay > 3000) {
			System.out.println("세금 :"+(intPay * .09));
		}
		if(intPay>10000  ) {
			System.out.println("세금 :"+(intPay * .12));
		}

	}

}
