package reference;

import java.util.Arrays;

public class ArrayExample2 {
	public static void main(String[] args) {
		
		
		int[] scores = new int[10];
		for(int i=0; i<scores.length; i++) {
			int temp = (int) (Math.random()*10)+1;	
			scores[i] = temp;
			
		}
		
		//scores �迭Ÿ��. scores[0] int Ÿ��
		for(int i=0,l=scores.length; i<l; i++) {
			System.out.printf("%d��° �л��� ������ %d �Դϴ�\n",i,scores[i]);
	
		}
		System.out.println("��1.");
	

		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum +=scores[i];
		}
		System.out.println("�迭�� �հ� : " + sum);
		System.out.println("��2.");
		
		sum = 0;
		for(int i=0; i<scores.length;i++) {
			if(scores[i]>5) {
				sum+=scores[i];
			}
		}
		System.out.println("5���� ū �� �հ� : " + sum);
		System.out.println("��3.");
		
		sum = 0;
		for(int i=0; i<scores.length;i++) {
			if(i%2==0) {
				sum+=scores[i];
			}
		}
		System.err.println("¦����° �� �հ� : " + sum);
		System.out.println("��4.");
		
	}
}
