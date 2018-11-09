package com.biz.control;

public class Control07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intNum =0 ;
		
		for(intNum = 0; intNum <100; intNum++) {
			System.out.println(intNum);
		}

		System.out.println("Last Num:" + intNum);
		
		for(int i = 0; i < 100; i++) {
			System.out.println(i);
		}
	            //System.out.println(i); 중괄호가 끝났기때문에 다시 값을 지정해야함.
		int intCount = 0;
		while(++intCount > 10) {
			//if(++intCount> 10) break;
			System.out.println(intCount + "대한민국");
		
		}
	
		intCount =0;
		while(intCount++ < 10) {
			System.out.println(intCount + "대한민국");
		}
	}
	

}
