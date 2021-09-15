package control;

public class DoWhileExe {
	public static void main(String[] args) {

//		boolean run = false;
//		int i;
//
//		do {
//			for (i = 1; i <= 10; i++) {
//				System.out.print(i + " ");
//			}
//			break;
//		} while (i < 10);
//		System.out.println("\n끝 1.");
//
//		do {
//			for (i = 1; i <= 10; i++) {
//				if (i % 2 == 0) {
//					System.out.print(i + " ");
//				}
//			}
//			break;
//		} while (i < 10);
//		System.out.println("\n끝 2.");
//
//		do {
//			for (i = 1; i <= 10; i++) {
//				if (i % 2 == 1) {
//					System.out.print(i + " ");
//				}
//			}
//			break;
//
//		} while (i < 10);
//		System.out.println("\n끝 3.\n");
//
//		int cnt = 0;
//		int sum = 0;
//		do {
//			if (cnt >= 10) {
//				break;
//			}
//			if (cnt % 2 == 0) {
//				cnt++;
//				continue;
//			}
//			sum += cnt++;
//		} while (true);
		
		
		int i = 1;
		int sum = 0;
		int random = (int)(Math.random()*11+1);
		System.out.println("값 : " + random);
		sum += random;
		
		do {

			if (sum <= 100) {
				System.out.println(i);
				i++;
				
			}

		} while(sum > 100);
		
	}
}
