
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username = "sampleUsername";
		String password = "samplePassword";
		String email = "sampleEmailID";
		String zip = "12345";
		String city = "sampleCity";
		
		String str[] = new String[5];
		
		str[0] = username;
		str[1] = password;
		str[2] = email;
		str[3] = zip;
		str[4] = city;
		
		System.out.println(str.length);
		
		for (int i=0; i<str.length; i++)
		{
			System.out.println(str[i]);
		}
	}

}
