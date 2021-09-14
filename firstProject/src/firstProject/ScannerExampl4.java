package firstProject;
import java.util.Scanner;

public class ScannerExampl4 {
	public static void main(String[] args) {
		
		// "100" vs 100
		int num1 = 100;
		String num2 = "100";

		int num2Int = Integer.parseInt(num2); // int -> Integer
		
		String num3 = "12.25";
		double num3Double = Double.parseDouble(num3);
		
		int result = num1 + num2Int;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("이름을 입력 >>> ");
		String name = scn.nextLine();
		
		// 나이를 입력하지 않았을때 0으로 처리
		System.out.println("나이를 입력 >>> ");
		String age = scn.nextLine();
		if(age.equals("")) { age = "0"; }
		int ageInt = Integer.parseInt(age);
		
		System.out.println("연락처를 입력 >>> ");
		String phone = scn.nextLine(); 
//		scn.nextLine();을 사용하면 그냥 엔터쳐도 넘어감 
		
		System.out.println("[입력한 내용]");
		System.out.printf("이름 : %s\t, 나이 : %d\t, 연락처 : %s", name, ageInt, phone); 
		
		
		
		
			
}}
