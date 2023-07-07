
public class InfinityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = Double.POSITIVE_INFINITY;  //양의 무한대
		double d2 = 100/0.0;                   //정수체계에서는 에러
		double d3 = Double.NEGATIVE_INFINITY;
		double d4 = d1 + d3;
		
		
		System.out.println("d1 =" + d1);
		System.out.println("d2 =" + d2);
		System.out.println("d4 =" + d4);  // Not a Number
		
		d1 = d1 + 99999999;
		d2 = 99999999 / d2;
		
		System.out.println("d1 =" + d1);
		System.out.println("d2 =" + d2);
		
	}

}
