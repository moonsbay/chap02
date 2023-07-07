
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "";  // empty string
//		char c1 = '';          empty 안됨
//		char c2 = ''';           따옴표 출력 안됨
		char c2 = '\'';     // \으로 출력 가능 escape의 의미
		String str2 = "Hello";
//		String str3 = ""Hello""  쌍따옴표 출력 안됨
		String str3 = "\"Hello\"";
		String str4 = "Hello\n World";
		
		System.out.println(c2);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}

}
