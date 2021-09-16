package reference;

import java.util.Arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		
		int[] scores = new int[10];
		for(int i=0; i<scores.length; i++) {
			int temp = (int) (Math.random()*10)+1;	
			scores[i] = temp;
			
		}
		
		//scores 배열타입. scores[0] int 타입
		for(int i=0,l=scores.length; i<l; i++) {
			System.out.printf("%d번째 학생의 점수는 %d 입니다\n",i,scores[i]);
	
		}
		System.out.println("끝1.");
	

		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		System.out.println("배열의 합계 : " + sum);
		System.out.println("끝2.");
		
		sum = 0;
		for(int i=0; i<scores.length;i++) {
			if(scores[i]>5) {
				sum+=scores[i];
			}
		}
		System.out.println("5보다 큰 값 합계 : " + sum);
		System.out.println("끝3.");
		
		sum = 0;
		for(int i=0; i<scores.length;i++) {
			if(i%2==0) {
				sum+=scores[i];
			}
		}
		System.err.println("짝수번째 값 합계 : " + sum);
		System.out.println("끝4.");
		
	}
}
