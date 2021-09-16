package reference;

public class EnhanceForExample {

	public static void main(String[] args) {
		
		String[] strAry = null;
		strAry = new String[] {"Hong","Park","Choi","Kim","Hwang"};
		System.out.println(strAry.length);

		
		strAry[2] = "Hong"; // ==, equals()
		
		for(int i=0; i<strAry.length; i++) {
			if(strAry[i].equals("Hong")) {
				System.out.println(strAry[i]);
			}
		}
		
		System.out.println("----------");
		
		/*		< 구조 >

		for(자료형 변수명: 배열명){

		변수가 배열을 순환하면서 반복할 명령;

		} 
*/
		//Enhanced for
		for (String name : strAry) {
			System.out.println(name);
		}
		
		int[] scores = {50,70,80,60};
		int sum = 0;
		for (int score : scores) {
			sum += score;
		}

	}
}
