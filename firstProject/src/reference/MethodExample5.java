package reference;

public class MethodExample5 {
	public static void main(String[] args) {
		
		int[] scores = {88,67,92,73,58};
		// �ּҰ� ���ϴ� �ڵ� 
		int minVal = getMinValue(scores);
		System.out.println("�ּҰ� : " + minVal);
		
		
		
}

	public static int getMinValue(int[] ary) {
		int minVal = 100;
		boolean isTrue = false;
		
		for(int i=0; i<ary.length; i++) {
			isTrue = minVal > ary[i];
			if (isTrue) {
				minVal = ary[i];
			}
		}
		return minVal;
		
	}
}