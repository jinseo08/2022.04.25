package day27_20220425_2;

import java.util.Scanner;

public class Calculator {

	/*
1. sum 메서드
    1. 매개변수: 정수형 변수 2개
    2. 리턴타입: 없음
    3. 실행내용: 덧셈 결과 출력
    */
	void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	/*
2. subtraction 메서드
    1. 매개변수: 정수형 변수 2개
    2. 리턴타입: 없음
    3. 실행내용: 뺄셈 결과 출력
    */
	void subtraction(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	
	/*
3. multiplication 메서드
    1. 매개변수: 정수형 변수 2개
    2. 리턴타입: 정수
    3. 실행내용: 곱셈후 곱셈 결과 리턴
    */
	
	int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	
	/*
4. division 메서드
    1. 매개변수: 없음
    2. 리턴타입: 정수
    3. 실행내용: 스캐너로 정수 2개 입력 받고 나눗셈 결과 리턴
	*/

	int division() {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("숫자 : ");
		int num2 = scan.nextInt();
		int result = num1 / num2;
		return result;
	}
	
}
