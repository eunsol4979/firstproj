package reference;

public class WhileExample {
	public static void main(String[] args) {
		
		int i = 1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		
		boolean run = true;
		while(run) {
			if(i==11) {
				run = false;
			}
			i++;
		}
		while(true) {
			if(i==11) {
				break;
			}
		}
		
		// 1 ~ 10 Â¦¼ö¸¸ Ãâ·Â
		i = 1;
		while(i<=10) {
			i++;
			if(i%2==0) {
			System.out.println(i);
		}}
		
		

	}
}
