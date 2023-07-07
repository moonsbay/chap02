
public class PrecisionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1 = 0.1234567890123456789012345f;
		double d1 = 0.1234567890123456789012345;
		
		System.out.println("f1 = "+ f1);  // 소수점이하 7자리까지가 유효.. 이후는 유효하지 않은 숫자
		System.out.println("d1 = "+ d1);  // 소수점이하 15자리까지가 유효.. 이후는 유효하지 않은 숫자
		
		float f2 = 1234567890123456789012345f;
		double d2 = 1234567890123456789012345.;
		
		System.out.println("f2 = "+ f2);  // 7자리까지가 유효.. 이후는 유효하지 않은 숫자
		System.out.println("d2 = "+ d2);  // 15자리까지가 유효.. 이후는 유효하지 않은 숫자
	} 

}
