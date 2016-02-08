package movieHandlerUpgrade;

public abstract class Product
{
	private String id;
	private String title;
	private Person person;
	
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
