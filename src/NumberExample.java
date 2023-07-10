
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
        int num5 = 2;
        int num6 = 4;
        double num7;
        num7 = num5 / num6;
        double num8;
        num8 = num5 / num6;
        double num9;
        num9 = num6 / num5;
        byte num4 = (byte)0b10011100;
        System.out.println("num1=" + num3);
        System.out.println("num2=" + num4);
        System.out.println(num7);
        System.out.println(num8);
        System.out.println(num9);
	}

}
