
public class NumberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        byte num1;
        num1 = 100;
        byte num2 = 0b01100100;
        System.out.println("num1=" + num1);
        System.out.println("num2=" + num2);
        byte num3 = -100;
        /*
         * 01100100 
         * 10011011 + 1 = 10011100 (-100) //100의 2진수의 보수에 +1을 하면 -100의 2진수가 됨
         * 
         */
        byte num4 = (byte)0b10011100;
        System.out.println("num1=" + num3);
        System.out.println("num2=" + num4);
	}

}
