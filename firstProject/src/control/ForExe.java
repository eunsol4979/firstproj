package control;

public class ForExe {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.printf("\n끝.");
		System.out.println();
		
		for(int i = 1; i <= 10; i++) {
			if(i %2 == 0) {
				System.out.print(i + " ");	
			}}
		System.out.printf("\n끝2.");
		System.out.println();
		
		
		for(int i = 1; i <= 10; i++) {
			if(i %2 == 1) {
			System.out.print(i + " ");
		}}
		System.out.printf("\n끝3.");
		System.out.println();
		
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계 : " + sum);
		System.out.println("끝4.");
	}
}
