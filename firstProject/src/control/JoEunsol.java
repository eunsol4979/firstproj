package control;

import java.util.Scanner;
public class JoEunsol {
	public static void main(String[] args) {
		
		System.out.println("���̵� �Է����ּ���");
		String id, password ;
		Scanner scan = new Scanner(System.in);
		id = scan.nextLine();
		
		while(true) {
		if(id.equals("Java"))
			{
			System.out.println("ID ��ġ");
			System.out.println("��й�ȣ�� �Է����ּ���");
			password = scan.nextLine();
			if(password.equals("abc123")) {
				System.out.println("PASSWORD��ġ");
				System.out.println("�α��� ����!");
				break;
			}
			else {
				System.out.println("PASSWORD ����ġ");
				continue;
			}
		}
		 
		else { 
			System.out.println("�α��� ����");
			System.out.println("�ٽ� �α��� �ϼ���");
			break;
		}}
		scan.close();
	}
}
