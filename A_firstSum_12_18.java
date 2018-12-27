//각 자릿수의 합 구하기

package com.one.day;

import java.util.Scanner;

public class A_firstSum_12_18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);  
		System.out.print("숫자를 입력하세요: "); 
		int num =sc.nextInt();  // 입력받은 값을 정수형으로 변수에 저장

		String str = String.valueOf(num); // 정수형을 문자형으로 반환

		int strLength = str.length(); // 문자형의 길이


		int sum=0;
		for (int i=0; i<strLength; i++ ) {       // 문자형의 길이에 따라 i값을 증가
			sum += Integer.parseInt(str.substring(i, i+1 ));    // 문자형을 정수형으로 변환하여 합을 구함
		}

		System.out.println(sum);


	}
}
