package control;

public class WhileExe {
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.printf("\n场.\n");
	
		i = 1;
		while(i<=10) {
			if (i %2 == 0) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.printf("\n场.\n");
		
		i = 1;
		while(i<=10) {
			if (i %2 == 1) {
				System.out.print(i + " ");
			}
			i++;
		}
		System.out.printf("\n场.\n");
		
		i = 1;
		int sum = 0;
		while(i<=10) {
			sum += i;
			i++;
		}
		System.out.println("1 ~ 10狼 钦 : " + sum);
		System.out.println("场.");
		
		

	}
}
