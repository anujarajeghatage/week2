package codingpractice;

public class throwexception {
	void validate(int age)
	{
		if(age<18)
		{
			throw new exception on("they are not valid");
		}
		else
		{
			System.out.println("They are eligible for C@TC batch");
		}
	}


	public static void main(String[] args) {
		throwexception obj=new throwexception();
		obj.validate(21);
		System.out.println("welcome to training");
		
		
	}

}
