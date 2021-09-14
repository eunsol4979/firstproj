package firstProject;

import java.util.Scanner;

public class VariableExample2 {
	public static void main(String[] args) {
		// 이름, 나이, 참/거짓
		
		int age = 25; 
		boolean a = age < 27;
		String n = "조은솔";
		
		
		if(a) { 
			System.out.println(n + "님은 " + "25세 이상입니다.");
		}
		else {	System.out.println(n + "님은" + "25세 이하입니다."); }
		
		System.out.println("end of program.");
	
		
		System.out.println("-------------------");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String s = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int	b = sc.nextInt();
		if(b <= age) {
			System.out.println(s + "님은 " + b +"세 미만 입니다.");
		}

		else {
			System.out.println(s + "님은 " + b + "세 이상 입니다.");
		}
		
		System.out.println("end of program");
	}
}
