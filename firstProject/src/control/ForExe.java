package control;

public class ForExe {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.printf("\n��.");
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			if(i %2 == 0) {
				System.out.print(i + " ");	
			}}
		System.out.printf("\n��2.");
		System.out.println();
		
		
		for(int i = 1; i <= 10; i++) {
			if(i %2 == 1) {
			System.out.print(i + " ");
		}}
		System.out.printf("\n��3.");
		System.out.println();
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("�հ� : " + sum);
		System.out.println("��4.");
	}
}
