package firstProject;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요...");
		String name = scn.nextLine();
		
		System.out.println("나이를 입력하세요...");
		int age = scn.nextInt(); // 입력된 숫자 + enter가 포함되어 있음
		scn.nextLine();			 // 그래서 nextInt 다음에 nextLine 적어줘야 함!!!! 
		System.out.println("취미를 입력하세요....");
		String hobby = scn.nextLine();
		
		System.out.println("[입력한 값]");
		System.out.printf("이름 : %s, 나이 : %d, 취미 : %s", name, age, hobby);
		
		

}}
