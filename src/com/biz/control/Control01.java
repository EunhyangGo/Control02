package com.biz.control;

public class Control01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int intPay = 4758760;
		
		// 5�������� ��ΰ�
		int count = 0;
		
		count = intPay / 50000;
		System.out.println("5������:" + 
		count);
		
		
		//pay���� 5�����ǿ� �ش��ϴ� �ݾ� ���� ��Ű��
		intPay = intPay - (count * 50000) ; // 5�������� ���ܵ� �ݾ�
		System.out.println(intPay);
		
		
		//1������ ���� ���
		count = intPay / 10000;
		System.out.println("1������:" + count);
		
		// ���ݿ��� 1������ �ݾ� ����
		intPay = intPay - (count * 10000);
		System.out.println(intPay);

		//5000������ ���� ���ϱ�
		count = intPay / 5000;
		System.out.println("5õ����:" + count);
		
		//���ݿ��� 5õ������ ���� ��Ű��
		intPay = intPay - (count * 5000);
		System.out.println(intPay);
		
		//1õ������ ���ϱ�
		count = intPay / 1000;
		System.out.println("1õ����:"+ count);
		
		//���ݿ��� 1õ������ ���� ��Ű��
		intPay = intPay - (count * 1000);
		System.out.println(intPay);
	}

}