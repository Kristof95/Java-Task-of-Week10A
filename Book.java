package movieHandlerUpgrade;

public class Book extends Product
{
	Person author;

	public Person getAuthor()
	{
		return author;
	}

	public void setAuthor(Person author)
	{
		this.author = author;
	}

	@Override
	public long getInvestment()
	{
		return author.getSalary();
	}

	public Book(Person author)
	{
		this.author = author;
		this.id = IdGenerator.generate(this);
	}
	
	
}
