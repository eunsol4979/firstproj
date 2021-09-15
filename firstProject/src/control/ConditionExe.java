package control;

import java.util.Scanner;

public class ConditionExe {
	public static void main(String[] args) {
		
		int a, b;
		a = 60; 
		b = 70;
		int result = a + b;
		if(result >= 100) {
			System.out.println("합격입니다");
		}
		else {
			System.out.println("불합격입니다");
		}
		System.out.println("끝.");
		
		int result2 = a * b;
		if (result2 % 2 == 0) {
			System.out.println("짝수입니다");
		}
		else if (result % 2 == 1) {
			System.out.println("홀수입니다");
		}
		System.out.println("2번째 끝.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int c = sc.nextInt();
		if (c % 2 == 0 && c % 3 ==0){
			System.out.println("2와 3의 배수입니다");
		} else if (c % 2 == 0) {
			System.out.println("2의 배수입니다");
		} else if (c % 3 == 0) {
			System.out.println("3의 배수입니다");
		}
		System.out.println("3번째 끝.");
		
		sc.close();
		
		System.out.println("--------------------");
		
		int randomValue = (int) (Math.random() * 6) + 1; //1~6
		System.out.println(randomValue);
		
		switch (randomValue) {
		case 1:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		case 2:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		case 3:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		case 4:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		case 5:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		default:
			System.out.println(randomValue+"이(가) 나왔습니다");
			break;
		}
		System.out.println("4번째 끝.");
		
		int randomScore = (int) (Math.random() * 100);
		System.out.println("점수는 " + randomScore + "점 입니다");
		
		if(randomScore >= 90) {
			System.out.println("A학점 입니다.");
		} else if(randomScore >= 80) {
			System.out.println("B학점 입니다.");
		} else if(randomScore >= 70) {
			System.out.println("C학점 입니다.");
		} else if(randomScore >= 60) {
			System.out.println("D학점 입니다.");
		} else {
			System.out.println("F학점 입니다.");
		}
		System.out.println("5번째 끝.");
		
		int randomScore2 = (int) (Math.random() * 100);
		System.out.println("점수는 " + randomScore2 + "점 입니다");
		randomScore2 /= 10;
		switch (randomScore2) {
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;	
		default:
			System.out.println("F학점 입니다.");
			break;
		}
		
		
		
		
	}}
