package com.biz.control;

public class Contorl03 {

	public static void main(String[] args) {
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0 ; 
		int index = 0;
		
		//5만원권
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =1
		if(index == 1) intPaper /= 5;
		
		//1만원권
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =2
		if(index ==2) intPaper /= 2;
		
		//5천원권
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =3
		if(index ==2) intPaper /= 5;
		
		
		//5만원권
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				//index ++; //index =1
				if(index++ % 2 == 0) intPaper /= 5;
				else intPaper /=2;
				//index가 짝수이면 나누기 5를 하고 아니면 나누기 2.
				
				//1만원권
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				//index ++; //index =2
				if(index++ % 2 == 0) intPaper /= 5;
				else intPaper /=2;
			
				
				//5천원권
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				index ++; //index =3
				if(index ==2) intPaper /= 5;
		
	}
}
