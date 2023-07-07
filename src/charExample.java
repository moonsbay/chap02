
public class charExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// char는 2byte -> UTF-16
		
		char c1 = 'A'; //문자하나는 '' 싱글 따옴표로 표현
		char c2 = 65;
		char c3 = 0b0100_0001; //2byte 2진수를 네개씩 언더바로 구분해도 됨
		System.out.println("c1=" + c1);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
		
		char c4 = '가';
		System.out.println("c4=" + c4);
		
		int ga = c4;
		System.out.println("ga=" + ga);
		
		int hit = '힣';
		System.out.println("hit=" + hit);
	}

}
