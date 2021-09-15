package control;

public class ForExample {
	public static void main(String[] args) {
		
		int cnt = 0;
		
		cnt += 1;
		System.out.println("cnt : %d\n" + cnt);
		
		cnt += 1;
		System.out.println("cnt : %d\n" + cnt);
		
		cnt += 1;
		System.out.println("cnt : %d\n" + cnt);
		
		System.out.println("==== 다시 ====");
		
		cnt = 0;
		for(int i = 1; i <= 3; i++) {
			cnt += i;
			System.out.printf("cnf : %d\n", cnt);
		}
		System.out.println("반복문 끝.");
		


	}}
