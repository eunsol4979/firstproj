package reference;

public class MethodExample2 {
	public static void main(String[] args) {

	sum(24,55); // �޼ҵ� ����.
	int a = 45, b = 77;
	sum(a,b);
	
	
	multi(13, 2);

	int res = getMax(a,b);
	System.out.println("�� ���� �� ū ���� : " + res);
	
	double result = divide(5,3);
	System.out.println("�� ���� ���� ���� : " + result);
	}
	
	
	// �� ������ �Է� �޾Ƽ� �� ���� ���� ������
	public static void sum(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("�� ���� �� : " + sum);
	}
	
	// �� ������ �Է� �޾Ƽ� �� ���� ���� ������
	public static void multi(int i1, int i2) {
		int multi = i1 * i2;
		System.out.println("�� ���� �� : " + multi);
	}
	
	// ���簢�� �ʺ� ������ִ� �޼ҵ� ����
	public static void getArea(double side) {
		double s = side * side;
		System.out.println("���簢���� �ʺ�� : " + s);
	}
	
	// �� ���߿��� ū ���� ��ȯ���ִ� �޼ҵ�.
	public static int getMax(int num1, int num2) {
		int result = (num1 >= num2)? num1 : num2;
		return result;
	}
	
	// �� ���� �Է� �޾� ù ��°�� �� ��° ������ ���� ��� ��ȯ
	public static double divide(int a, int b) {
		double result = a/b;
		return result;
	}
	
	
	
	
	
}
