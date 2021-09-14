package firstProject;

public class StringExample {
	public static void main(String[] args) {

/*		데이터 타입 크기 
		byte < short < int < long < float < double
*/		
		int age = 20;
		String name = "홍길동";
		
		long myAge = age; // 자동형변환(promotion)
		age = (int) myAge;// 강제형변환(casting)
		System.out.println(name + "의 나이는 " + age);
		
		String name1 = "조은솔";
		int age1 = 27;
		System.out.println(name1 + "의 나이는 " + age1 + "살 입니다.");
		
		
		
		
		
		
		
		
		
		
		
	}
}
