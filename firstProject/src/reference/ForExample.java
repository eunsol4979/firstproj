package reference;

public class ForExample {
	public static void main(String[] args) {
		
		{
			int i = 0;
			int j = 0;
		}
		
		
		for(int i=1; i<=10; i++) {
			System.out.print(i);
		}
		System.out.print("\n��1.\n");
	
		for(int i=1; i<=10; i++){
			if (i%2==0) {
				System.out.print(i);
			}
		}
		System.out.println("\n��2.");
		
		int sum=0;
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println("�հ� : " +sum);
		System.out.println("��3.");
		
		// 1 ~ 10 sum�� ���� 20�� �Ѿ�� �׶��� Ƚ��
		sum = 0;
		int cnt = 0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			if(sum>=20) {
				cnt = i;
				break;
			}
		}
		System.out.println("Ƚ�� : "+ cnt);
	
		
		
		

	}
}
