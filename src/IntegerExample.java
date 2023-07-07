
public class IntegerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0b01111111_11111111_11111111_11111111;
		int min = 0b10000000_00000000_00000000_00000000;
		
		System.out.println("max =" + max);
		System.out.println("min =" + min);
		
		max = max + 1;                      //overflow 되어 min값이 나옴.. min-1은 underflow
		System.out.println("max =" + max);
	}

}
