package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		
		String name = "������";
		int age = 27;
		
		System.out.println("�̸��� " + name + ", ���̴� " + age);
		System.out.printf("�̸��� %s, ���̴� %d", name, age);
		
		System.out.println();
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(result);
		
		boolean isLarger = result > 0;
		if (isLarger) {
			System.out.println("��� �Դϴ�.");
		}
		else {
			System.out.println("���� �Դϴ�.");
		}
		
//		 2200000000, 120

		long a1 = 2200000000L;
		double a2 = 78;
		double a3 = 8;
		
		double avg = a2/a3;
		System.out.println(avg);
		
		
}}
