package movieHandlerUpgrade;
import java.util.*;

public class Game extends Product implements Buyable
{
	private boolean preOrdered;
	private List<Person> staff;
	private int price;
	
	public Game(boolean preOrdered, List<Person> staff, int price)
	{
		super();
		this.preOrdered = preOrdered;
		this.staff = staff;
		this.price = price;
	}

	public boolean isPreOrdered()
	{
		return preOrdered;
	}
	
	public void setPreOrdered(boolean preOrdered)
	{
		this.preOrdered = preOrdered;
	}
	
	public List<Person> getStaff()
	{
		return staff;
	}
	
	public void setStaff(List<Person> staff)
	{
		this.staff = staff;
	}
	
	@Override
	public int getPrice()
	{
		if (preOrdered == true)
		{
			return price * (80/100);
		}
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}
	
	@Override
	public long getInvestment()
	{
		int total = 0;
		for (Person person : staff)
		{
			total += person.getSalary();
		}
		return total;
	}
	
	
}
