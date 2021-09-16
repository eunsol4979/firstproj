package reference;

import java.util.Arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] intAry = {1,2,3,4,5};
		
		System.out.println(intAry[0]);
		System.out.println(intAry[1]);
		System.out.println(intAry[2]);
		System.out.println(intAry[3]);
		System.out.println(intAry[4]);
		
		for(int i=0; i<5; i++) {
			System.out.print(intAry[i]+" ");
		}
		System.out.println();
		
		intAry[0] = 6;
		intAry[1] = 7;
		intAry[2] = 8;
		intAry[3] = 9;
		intAry[4] = 10;
		
		int[] arr2 = {3,4,5,6,7,8};
		System.out.println(Arrays.toString(arr2));
		
		byte[] byteAry = {1,2,3};
		for(int i=0; i<3; i++) {
			System.out.print(byteAry[i]+" ");
		}
		System.out.println();
		
		String[] strAry = {"¾È³ç","hello"};
		strAry = new String[] {"Á¶","Àº","¼Ö"};
		
		double[] dblAry;
		dblAry = new double[] {1,2.3,4.5};
		
		float[] fltAry = new float[5];
		for(int i=0; i<fltAry.length; i++) {
			System.out.println(fltAry[i]);
		}
		
		
		
	}
}
