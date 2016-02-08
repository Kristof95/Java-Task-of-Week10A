package movieHandlerUpgrade;

public class IdGenerator
{
	private static int identifier = 1;
	public static String generate(Product obj)
	{
		if (obj instanceof Movie)
		{
			return "MOV"+identifier++;
		}
		else if (obj instanceof Game)
		{
			identifier -= 1;
			return "GAM"+identifier++;
		}
		else if (obj instanceof Book)
		{
			identifier -= 1;
			return "BOO"+identifier++;
		}
		return null;
	}
}
