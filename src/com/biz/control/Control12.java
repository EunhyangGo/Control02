package com.biz.control;

public class Control12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �޿����� 3000�����̸� 6%, 3000 �ʰ� 10000 �����̸� 9%, 10000�� �ʰ��ϸ� 12%
		
		int intPay = 3000;
		if(intPay <= 3000) {
			System.out.println("���� :"+(intPay * 0.06));
		}
		//intPay�� 10000���� �̸鼭 3000�� �ʰ��ϸ�
		//int ( 10000>=intPay && 3000 < intPay)�� �������� �ε�ȣ�� ���� �������� ���ִ°��� ����.
		if(10000 >= intPay && intPay > 3000) {
			System.out.println("���� :"+(intPay * .09));
		}
		if(intPay>10000  ) {
			System.out.println("���� :"+(intPay * .12));
		}

	}

}
