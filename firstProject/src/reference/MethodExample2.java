package reference;

public class MethodExample2 {
	public static void main(String[] args) {

	sum(24,55); // 메소드 실행.
	int a = 45, b = 77;
	sum(a,b);
	
	
	multi(13, 2);

	int res = getMax(a,b);
	System.out.println("두 정수 중 큰 수는 : " + res);
	
	double result = divide(5,3);
	System.out.println("두 수를 나눈 수는 : " + result);
	}
	
	
	// 두 정수를 입력 받아서 두 수의 합을 보여줌
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("두 수의 합 : " + sum);
	}
	
	// 두 정수를 입력 받아서 두 수의 곱을 보여줌
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("두 수의 곱 : " + multi);
	}
	
	// 정사각형 너비를 계산해주는 메소드 생성
	public static void getArea(double side) {
		double s = side * side;
		System.out.println("정사각형의 너비는 : " + s);
	}
	
	// 두 수중에서 큰 값을 반환해주는 메소드.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2)? num1 : num2;
		return result;
	}
	
	// 두 수를 입력 받아 첫 번째를 두 번째 값으로 나눈 결과 반환
	public static double divide(int a, int b) {
		double result = a/b;
		return result;
	}
	
	
	
	
	
}
