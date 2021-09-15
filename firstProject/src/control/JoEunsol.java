package control;

import java.util.Scanner;
public class JoEunsol {
	public static void main(String[] args) {
		
		System.out.println("아이디를 입력해주세요");
		String id, password ;
		Scanner scan = new Scanner(System.in);
		id = scan.nextLine();
		
		while(true) {
		if(id.equals("Java"))
			{
			System.out.println("ID 일치");
			System.out.println("비밀번호를 입력해주세요");
			password = scan.nextLine();
			if(password.equals("abc123")) {
				System.out.println("PASSWORD일치");
				System.out.println("로그인 성공!");
				break;
			}
			else {
				System.out.println("PASSWORD 불일치");
				continue;
			}
		}
		 
		else { 
			System.out.println("로그인 실패");
			System.out.println("다시 로그인 하세요");
			break;
		}}
		scan.close();
	}
}
