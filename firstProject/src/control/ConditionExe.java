package control;

import java.util.Scanner;

public class ConditionExe {
	public static void main(String[] args) {
		
		int a, b;
		a = 60; 
		b = 70;
		int result = a + b;
		if(result >= 100) {
			System.out.println("�հ��Դϴ�");
		}
		else {
			System.out.println("���հ��Դϴ�");
		}
		System.out.println("��.");
		
		int result2 = a * b;
		if (result2 % 2 == 0) {
			System.out.println("¦���Դϴ�");
		}
		else if (result % 2 == 1) {
			System.out.println("Ȧ���Դϴ�");
		}
		System.out.println("2��° ��.");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int c = sc.nextInt();
		if (c % 2 == 0 && c % 3 ==0){
			System.out.println("2�� 3�� ����Դϴ�");
		} else if (c % 2 == 0) {
			System.out.println("2�� ����Դϴ�");
		} else if (c % 3 == 0) {
			System.out.println("3�� ����Դϴ�");
		}
		System.out.println("3��° ��.");
		
		sc.close();
		
		System.out.println("--------------------");
		
		int randomValue = (int) (Math.random() * 6) + 1; //1~6
		System.out.println(randomValue);
		
		switch (randomValue) {
		case 1:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		case 2:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		case 3:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		case 4:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		case 5:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		default:
			System.out.println(randomValue+"��(��) ���Խ��ϴ�");
			break;
		}
		System.out.println("4��° ��.");
		
		int randomScore = (int) (Math.random() * 100);
		System.out.println("������ " + randomScore + "�� �Դϴ�");
		
		if(randomScore >= 90) {
			System.out.println("A���� �Դϴ�.");
		} else if(randomScore >= 80) {
			System.out.println("B���� �Դϴ�.");
		} else if(randomScore >= 70) {
			System.out.println("C���� �Դϴ�.");
		} else if(randomScore >= 60) {
			System.out.println("D���� �Դϴ�.");
		} else {
			System.out.println("F���� �Դϴ�.");
		}
		System.out.println("5��° ��.");
		
		int randomScore2 = (int) (Math.random() * 100);
		System.out.println("������ " + randomScore2 + "�� �Դϴ�");
		randomScore2 /= 10;
		switch (randomScore2) {
		case 9:
			System.out.println("A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("B���� �Դϴ�.");
			break;
		case 7:
			System.out.println("C���� �Դϴ�.");
			break;
		case 6:
			System.out.println("D���� �Դϴ�.");
			break;	
		default:
			System.out.println("F���� �Դϴ�.");
			break;
		}
		
		
		
		
	}}
