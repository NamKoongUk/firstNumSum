//�� �ڸ����� �� ���ϱ�

package com.one.day;

import java.util.Scanner;

public class A_firstSum_12_18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		System.out.print("���ڸ� �Է��ϼ���: "); 
		int num =sc.nextInt();  // �Է¹��� ���� ���������� ������ ����

		String str = String.valueOf(num); // �������� ���������� ��ȯ

		int strLength = str.length(); // �������� ����


		int sum=0;
		for (int i=0; i<strLength; i++ ) {       // �������� ���̿� ���� i���� ����
			sum += Integer.parseInt(str.substring(i, i+1 ));    // �������� ���������� ��ȯ�Ͽ� ���� ����
		}

		System.out.println(sum);


	}
}
