package com.biz.control;

public class Contorl03 {

	public static void main(String[] args) {
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0 ; 
		int index = 0;
		
		//5������
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =1
		if(index == 1) intPaper /= 5;
		
		//1������
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =2
		if(index ==2) intPaper /= 2;
		
		//5õ����
		count = intPay / intPaper ;
		intPay -=(intPaper * count);
		index ++; //index =3
		if(index ==2) intPaper /= 5;
		
		
		//5������
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				//index ++; //index =1
				if(index++ % 2 == 0) intPaper /= 5;
				else intPaper /=2;
				//index�� ¦���̸� ������ 5�� �ϰ� �ƴϸ� ������ 2.
				
				//1������
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				//index ++; //index =2
				if(index++ % 2 == 0) intPaper /= 5;
				else intPaper /=2;
			
				
				//5õ����
				count = intPay / intPaper ;
				intPay -=(intPaper * count);
				index ++; //index =3
				if(index ==2) intPaper /= 5;
		
	}
}
