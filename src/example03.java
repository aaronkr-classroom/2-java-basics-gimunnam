public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b = 6;
		short s = 2;
		int i = 12;
		long l = 123456789012345L;
		
		char c = 'Y';
		char c2 = 88; //ASCII CODE OK
		String str = "Do you like pizza?";
		
		float f = 12.3456789f;
		double d = 1234567890.123456789; //D는 선택
		boolean bool = true; //소문자로 시작해야 함.
		
		// 출력하기
		System.out.print(str);
		System.out.print(bool);
		System.out.print(" " + c);
		System.out.println(); //다음 줄로 넘어가기
		System.out.print("\tNumbers");
		System.out.print("\tByte: " + b);
		System.out.print("\tshort: " + s);
		System.out.print("\tint: " + i);
		System.out.print("\tlong: " + l);
		System.out.print("\tfloat: " + f);
		System.out.print("\tdouble: " + d);
		
		System.out.print("\nchar2: " + c2);
		char c3 = 89;
		System.out.print("\nchar3: " + c3);

	}

}
