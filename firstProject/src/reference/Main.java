package reference;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 1.학생 수 지정 2.학생이름 입력 3.출력 4.종료
		String[] names = null;
		int[] number = null;
		while (true) {
			showMenu();
			int c = readInt("번호를 선택하세요.");
			if (c == 1) {
				int size = creatStudent();
				names = new String[size];
				
			} else if (c == 2) {
				inputValue(number);
			
			} else if (c == 3) {
				showList(number);

			} else if (c == 4) {
				System.out.println("종료합니다.");
				break;

			}

		}
	}

	public static void showMenu() {
		System.out.println("1.학생 수 지정 2.학생이름 입력 3.출력 4.종료");
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
		int cnt = readInt("학생 수를 입력하세요.");
		return cnt;
	}

	public static void inputValue(int[]ary) {
		for (int i=0; i < ary.length; i++) {
			ary[i] = readInt((i+1)+"번째 학생 이름을 입력하세요.");
		}
	}

	public static void showList(int[] ary) {
		for (int i = 0; i < ary.length; i++) {
			System.out.printf("%d번째 학생 : %d\n", i, ary[i]);
		}
	}
}
