package day27_20220425_2;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		/*
		프로그램을 실행하면 1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료 
		선택창이 출력됨 (while 문 활용)
		각 메서드 정의에 맞게 호출하여 결과를 출력한다.
    	1. 덧셈 메서드 sum 호출
    	2. 뺄셈 메서드 subtraction 호출
    	3. 곱셈 메서드 multiplication 호출
    	4. 나눗셈 메서드 division 호출
		 */
		
		Calculator cal1 = new Calculator();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int num1 = 0, num2 = 0, result = 0, input = 0;
		
		while(run) {
			System.out.println("-------------------------------");
			System.out.println("1.덧셈 2.뺄셈 3.곱셈 4.나눗셈 5.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 > ");
			
			input = scan.nextInt();
			if(input == 1) {
				System.out.print("숫자 : ");
				num1 = scan.nextInt();
				System.out.print("숫자 : ");
				num2 = scan.nextInt();
				cal1.sum(num1,num2);
				
			}else if(input == 2) {
				System.out.print("숫자 : ");
				num1 = scan.nextInt();
				System.out.print("숫자 : ");
				num2 = scan.nextInt();
				cal1.subtraction(num1,num2);
				
			}else if(input == 3) {
				System.out.print("숫자 : ");
				num1 = scan.nextInt();
				System.out.print("숫자 : ");
				num2 = scan.nextInt();
				
				result = cal1.multiplication(num1,num2);
				System.out.println(result);
			
			} else if(input == 4) {
				System.out.println(cal1.division());
				
			} else if(input == 5) {
				System.out.println("종료");
				run = false;
			} else {
				System.out.println("숫자를 확인해주세요");
			}
		}
		
		
	}
}
