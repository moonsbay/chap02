
public class NanExample {
        /*
         * 1. +0, -0
         * 2. -Infinity, +Infinity
         * 3. NaN
         */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d1 = Double.NaN;
		double d2 = 0.0 / 0.0;
		
		d1 = d1 * 100 + 200;  // NaN으로 계산해봤자 NaN
		d2 = d2 * 100 + 200;
		
		System.out.println("d1 =" + d1);
		System.out.println("d2 =" + d2);
	}

}
