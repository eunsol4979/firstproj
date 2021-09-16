package reference;

import java.util.Scanner;

public class AppMain {
	public static void main(String[] args) {

		// �л������� ���� �����м�.

		// �л��ο� ����, �л�����, ��ü����Ʈ, �м�:���, �ְ���, ����

		int[] scores = null;
		while (true) {
			showMenu();
			int choice = readInt("��ȣ�� �����ϼ���>>");

			if (choice == 1) {
				int size = createStudent();
				scores = new int[size];
				
			} else if (choice == 2) {
				inputValue(scores);
				
			} else if (choice == 3) {
				showList(scores);

			} else if (choice == 4) {
				analysis(scores);
				
			} else if (choice == 5) {
				break;
			}

		}

	}

	public static void showMenu() {
		System.out.println("1. �л��ο� ����, 2. �л������Է�, 3. ��ü����Ʈ, 4. �м�:���,�ְ���, 5. ����");

	}

	public static int createStudent() {
		int cnt = readInt("�л����� �Է��ϼ���.");
		return cnt;
	}

	public static void inputValue(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");
			return;
		}
		for (int i = 0; i < ary.length; i++) {
			ary[i] = readInt((i+1)+ "��° �л� ������ �Է��ϼ���.");
		}
	}

	public static void showList(int[] ary) {
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");
			return;
		}
		
		for(int i=0; i<ary.length; i++) {
			// scores[0] => 88
			System.out.printf("scores[%d} => %d\n",i,ary[i]);
		}
	}

	public static void analysis(int[] ary) {
		// ���, �ְ��� => �ֿܼ� ���
		
		if (ary == null) {
			System.out.println("���� �л����� �Է��ϼ���.");
			return;
		}
		double avg = 0;
		int maxVal = 0, sum = 0;
		for(int score : ary) {
			sum += score;
		if (maxVal < score) {
			maxVal = score;
		}
	}	
		avg = (double)sum/ary.length;
		System.out.printf("��� : %d, �ְ��� : ",avg,maxVal);
	
		
	}

	public static int readInt(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int menu = sc.nextInt();
		return menu;
	}

}
