package firstProject;

public class StringExample {
	public static void main(String[] args) {

/*		������ Ÿ�� ũ�� 
		byte < short < int < long < float < double
*/		
		int age = 20;
		String name = "ȫ�浿";
		
		long myAge = age; // �ڵ�����ȯ(promotion)
		age = (int) myAge;// ��������ȯ(casting)
		System.out.println(name + "�� ���̴� " + age);
		
		String name1 = "������";
		int age1 = 27;
		System.out.println(name1 + "�� ���̴� " + age1 + "�� �Դϴ�.");
		
		
		
		
		
		
		
		
		
		
		
	}
}
