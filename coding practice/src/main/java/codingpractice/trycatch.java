package codingpractice;

public class trycatch {

	public static void main(String[] args) {
		int num1=50/5;
		System.out.println(num1);
		int num2=50/2;
		System.out.println(num2);
		try
		{
			int num3=50/0;
			System.out.println(num3);
		}
		catch(Exception e)
		{
		System.out.println(e);	
		}
		int num4=50/3;
		System.out.println(num4);
		finally
		{
			System.out.println("this is finally block which prints compulsory")
		}
		
		
	}

}
