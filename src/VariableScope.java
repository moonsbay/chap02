
public class VariableScope {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;    //block scope
		{
			int num2 = 200;
			
			System.out.println(num);
			System.out.println(num2);
		}
		System.out.println(num);
//		System.out.println(num2);
		
	}

}
