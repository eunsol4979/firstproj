package firstProject;

import java.util.Scanner;

public class ScannerExampl3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영어 점수 입력 : ");
		int a = sc.nextInt();
		System.out.println("수학 점수 입력 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("이름 입력 : ");
		String n = sc.nextLine();
		
		int[] arr = {a, b};
		int sum = a + b;
		int avr = sum/arr.length;
		
		System.out.printf("%s님의 영어, 수학점수의 합은 : %d 이고 평균은 %d 입니다",n,sum,avr);
		
		System.out.println(); 
		
		if(sum >= 120) {
			System.out.println(n + "님은 합격입니다.");
		}
		else {
			System.out.println(n + "님은 불합격입니다.");
		}
	
		
		
		
		
		
		
		
		
		

	}}
