package week3.day1.classroomAssignment2;

public class Calculator
{

	
		public void add(int a,int b)
		{
			System.out.println("Sum of two nos = " +(a+b));
			
		}
		public void add(int a,int b, int c)
		{
			System.out.println("Sum of three nos = "+(a+b+c));
		}
		public void multiply(int a,int b)
		{
			System.out.println("Multiply two nos(int) = "+(a*b));
			
		}
		public void multiply(double a, double b)
		{
			System.out.println("Multiply two nos(double)= "+(a*b));
		}
	
		public void divide(int a, int b)
		{
			System.out.println("Divide two nos(int)= "+(a/b));
		}
		public void divide(double a, int b)
		{
			System.out.println("Divide two nos(int&double) = "+(a/b));
		}
		public static void main(String[] args)
		{
			Calculator calculator = new Calculator();
			calculator.add(10, 10);
			calculator.add(20, 20, 20);
			calculator.multiply(20, 20);
			calculator.multiply(123.22, 123.22);
			calculator.divide(10, 5);
			calculator.divide(555.55, 10);
		}
}
