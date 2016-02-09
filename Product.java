package movieHandlerUpgrade;

public abstract class Product
{
	String id;
	String title;
	Person person;
	
	public String getTitle()
	{
		return title;
	}
	
	public Person getPerson()
	{
		return person;
	}
	
	public long getInvestment()
	{
		return 0;
	}
}
