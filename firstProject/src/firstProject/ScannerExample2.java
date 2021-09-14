package firstProject;
import java.util.Scanner;

public class ScannerExample2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값을 입력하세요.");
		int a = sc.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		int b = sc.nextInt();
		int result = a + b;
		System.out.printf("%d + %d = %d", a, b, result);
		
		
		
		

	}}
