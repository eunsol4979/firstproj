package reference;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1.�л� �� ���� 2.�л��̸� �Է� 3.��� 4.����
		String[] names = null;
		int[] number = null;
		while (true) {
			showMenu();
			int c = readInt("��ȣ�� �����ϼ���.");
			if (c == 1) {
				int size = creatStudent();
				names = new String[size];
				
			} else if (c == 2) {
				inputValue(number);
			
			} else if (c == 3) {
				showList(number);

			} else if (c == 4) {
				System.out.println("�����մϴ�.");
				break;

			}

		}
	}

	public static void showMenu() {
		System.out.println("1.�л� �� ���� 2.�л��̸� �Է� 3.��� 4.����");
	}

	public static int readInt(String str) {
		Scanner sc = new Scanner(System.in);
		System.out.println(str);
		int menu = sc.nextInt();
		return menu;

	}
	public static String namee (String name) {
		Scanner scn = new Scanner(System.in);
		System.out.println(name);
		int name2 = scn.nextLine();
		return name2;
	}

	public static int creatStudent() {
		int cnt = readInt("�л� ���� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(int[]ary) {
		for (int i=0; i < ary.length; i++) {
			ary[i] = readInt((i+1)+"��° �л� �̸��� �Է��ϼ���.");
		}
	}

	public static void showList(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d��° �л� : %d\n", i, ary[i]);
		}
	}
}
