package firstProject;

import java.util.Scanner;

public class VariableExample2 {
	public static void main(String[] args) {
		// �̸�, ����, ��/����
		
		int age = 25; 
		boolean a = age < 27;
		String n = "������";
		
		
		if(a) { 
			System.out.println(n + "���� " + "25�� �̻��Դϴ�.");
		}
		else {	System.out.println(n + "����" + "25�� �����Դϴ�."); }
		
		System.out.println("end of program.");
	
		
		System.out.println("-------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String s = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		int	b = sc.nextInt();
		if(b <= age) {
			System.out.println(s + "���� " + b +"�� �̸� �Դϴ�.");
		}

		else {
			System.out.println(s + "���� " + b + "�� �̻� �Դϴ�.");
		}
		
		System.out.println("end of program");
	}
}
