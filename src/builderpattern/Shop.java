package builderpattern;

public class Shop 
{
	public static void main(String[] args) 
	{
		Phone p = new PhoneBuilder().setOs("Androide").setRam(4).setScreensize(6.1).getPhone();
		System.out.println(p);
	}
}
