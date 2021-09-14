package firstProject;

public class VariableExample {
	public static void main(String[] args) {
		int number1 = 10; // 변수 <--> 상수
		number1 = 20;
		number1 = 30;
		System.out.println("결과 : " + number1);
		
		int number3 = 90; 
		int result;
		
		final int number2 = 20;
//		number2 = 10; 상수는 변할 수 x
		
/*		데이터 타입 크기 
		byte < short < int < long < float < double
*/		
		result = number1 + number2;
		System.out.println("결과값 : " + result);
		double result1 = number3 / 20.0;
		System.out.println(result1);
		

		
		
		
	}
}
