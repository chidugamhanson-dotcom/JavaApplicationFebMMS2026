public class OperatorPart2{
	public static void main(String[] args)
	{
		//AND
		int num1 = 50;
		int num2 = 80;
		int num3 = 30;
		
		boolean isAND =(num1 > num2)&&(num1 > num3);
		boolean isOR =(num1 > num2)||(num1 > num3);
		boolean isNOT =!((num1 > num2)||(num1 > num3));
		
		System.out.printf("is %d > %d) && (%d > %d): %b%n",num1,num2,num1,num3,isAND);
		System.out.printf("is (%d > %d) || (%d > %d): %b%n",num1,num2,num1,num3,isOR);
		System.out.printf("is (%d > %d) ||(%d > %d): %b%n",num1,num2,num1,num3,isNOT); 	
		
	}
	
}