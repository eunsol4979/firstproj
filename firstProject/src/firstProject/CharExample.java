package firstProject;

public class CharExample {
	public static void main(String[] args) {
		
		//int, String, boolean, char
		//byte(1byte) < char, short(1byte) < ing < long
		char myFirstCharType = 65;
		
		System.out.println(myFirstCharType);
		
		byte b1 = 10; // 1byte(8bit) ||  
		// 0 0 0 0 0 0 0 0 -> 1byte
		// 2*1 2*2 2*3 2*8 -> 256가지 (-128 ~ 127)
		
		b1 = 127; // 제일 큰 값에 +를 하게 되면 제일 작은 값이 나온다
		b1++; //b1 = b1 + 1;
		System.out.println(b1);
	
		short s1 = 0; // -128 + 0
		// short = -32768 ~ 32767 
		// 기본형 int기 때문에 강제형변환 해줘야 함
		int result = b1 + s1; //short + short 
		System.out.println(Integer.MAX_VALUE);
		
		int fakeLong = 2147483647;
		
		
		
}}
