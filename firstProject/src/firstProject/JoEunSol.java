package firstProject;

import java.util.Scanner;

public class JoEunSol {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("���� ���� �Է� : ");
		int a = sc.nextInt();
		System.out.println("���� ���� �Է� : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String n = sc.nextLine();
		
		int[] arr = {a, b};
		int sum = a + b;
		int avr = sum/arr.length;
		
		System.out.printf("%s���� ����, ���������� ���� : %d �̰� ����� %d �Դϴ�",n,sum,avr);
		
		System.out.println(); 
		
		if(avr >= 60) {
			System.out.println(n + "���� �հ��Դϴ�.");
		}
		else if(avr <= 50) {
			System.out.println(n + "���� ���հ��Դϴ�.");
		}
	
		
		

	}}
