package com.biz.control;

public class Control02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intPay = 4758760;
		int intPaper = 50000;
		int count = 0 ; // ? �׷��� �� pay��paper���� ���� int�� ���̴°���
		
		// 5������ ���� ���
		count = intPay / intPaper;

		//count ������ int ������ ����Ǿ� �ֱ� ������ = �ڿ��� � ���(����)����� ���͵� 
		// ������ �Ҽ��� ���ϴ� �߶������ ���� �κи� count ������ ����ȴ�.
		
		System.out.println("5������ :" + count);
	
		//���� 5�������� ��� ������ 5�������� ������ �ݾ׿��� ������ ȭ�� ������ ����Ѵ�.
		
		//������ intPay�κ��� 5�������� �ż��� ��������Ƿ� 1�������� ����ҋ���
		//5������ �ݾ׸�ŭ�� �����ϰ� 1���� �ż��� ���ؾ��Ѵ�.
		//intpaper = 50000, count = 5�������� ������ ���� intpay�� �ٽ� ����
		intPay -= (intPaper * count);
		intPaper /= 5; // �׸鰡�� 5�������� 1�������� �����ϴ°��̴�. 
		count = intPay / intPaper;
		System.out.println("1������: "+ count);
		
		//5õ���� ���ϱ�
		intPay -= (intPaper * count);
		intPaper /= 2; // 5õ���� 
		
		//õ���Ǳ��ϱ�
		count = intPay / intPaper;
		intPay = (intPaper * count);
		intPaper /=5;

		//�������
		count = intPay / intPaper;
		intPay = (intPaper * count);
		intPaper /=2;
		
		//�����
		count = intPay / intPaper;
		intPay = (intPaper * count);
		intPaper /=5;
	}

}
