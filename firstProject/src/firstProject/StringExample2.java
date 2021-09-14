package firstProject;

public class StringExample2 {
	public static void main(String[] args) {
		
		String name = "조은솔";
		int age = 27;
		
		System.out.println("이름은 " + name + ", 나이는 " + age);
		System.out.printf("이름은 %s, 나이는 %d", name, age);
		
		System.out.println();
		
		byte b1 = -90;
		byte b2 = 10;
		byte result = (byte)(b1 + b2);
		System.out.println(result);
		
		boolean isLarger = result > 0;
		if (isLarger) {
			System.out.println("양수 입니다.");
		}
		else {
			System.out.println("음수 입니다.");
		}
		
//		 2200000000, 120

		long a1 = 2200000000L;
		double a2 = 78;
		double a3 = 8;
		
		double avg = a2/a3;
		System.out.println(avg);
		
		
}}
