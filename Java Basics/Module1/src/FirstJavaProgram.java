
public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Print Something Here!!");
		
		System.out.println("-----------------------");
		System.out.println("First Line");
		System.out.println("Second Line");
		System.out.println("Third Line");
		
		System.out.println("-----------------------");
		System.out.println("First Line");
		System.out.print("Second Line");
		System.out.println("Third Line");
		
		byte b1 = 1;
		byte b2 = 99;
		System.out.println(b1);
		System.out.println(b2);
		
		/*
		
		int a = 1000000000;
		int b = 0;
		System.out.println(a);
		System.out.println(b);
		
		long l1 = 999999999;
		long l2 = -999999999;
		System.out.println(l1);
		System.out.println(l2);
		
		double c = 4589.123456789;
		System.out.println(c);
		
		char s1 = '#';
		char s2 = 'A';
		char s3 = 'a';
		char s4 = '1';
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		boolean e = true;
		System.out.println(e);
		
		*/
		
		String s = "I am learning the Java Basics for Selenium Testing Course!";
		System.out.println(s);
		
		int x = 100;
		int y = 1000;
		int z = 20;
		
		if (x > y)
		{
			if (x > z)
			{
				System.out.println("The biggest number among x,y,z is : " + x);
			}
			else
			{
				System.out.println("The biggest number among x,y,z is : " + z);
			}
		}
		else
		{
			if (y > z)
			{
				System.out.println("The biggest number among x,y,z is : " + y);
			}
			else
			{
				System.out.println("The biggest number among x,y,z is : " + z);
			}
		}
		
		if (x > y & x > z)
			System.out.println("X is greater among the given three numbers and it's value is : " + x);
		else if (y > z)
			System.out.println("Y is greater among the given three numbers and it's value is : " + y);
		else
			System.out.println("Z is greater among the given three numbers and it's value is : " + z);
	}

}
