package firstProject;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���...");
		String name = scn.nextLine();
		
		System.out.println("���̸� �Է��ϼ���...");
		int age = scn.nextInt(); // �Էµ� ���� + enter�� ���ԵǾ� ����
		scn.nextLine();			 // �׷��� nextInt ������ nextLine ������� ��!!!! 
		System.out.println("��̸� �Է��ϼ���....");
		String hobby = scn.nextLine();
		
		System.out.println("[�Է��� ��]");
		System.out.printf("�̸� : %s, ���� : %d, ��� : %s", name, age, hobby);
		
		

}}
