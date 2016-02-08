package movieHandlerUpgrade;

import java.util.*;

public class Movie extends Product implements Buyable
{
	public enum Genre
	{
		ACTION,THRILLER,HORROR,SCI_FI,ROMANTIC,COMEDY,DRAMA
	}
	
	private Genre genre;
	private long duration;
	private double rate;
	private List<Person> cast;
	private int price;
	
	public Movie(Genre genre, long duration, double rate, List<Person> cast, int price)
	{
		super();
		this.genre = genre;
		this.duration = duration;
		this.rate = rate;
		this.cast = cast;
		this.price = price;
	}
	
	public Genre getGenre()
	{
		return genre;
	}
	
	public void setGenre(Genre genre)
	{
		this.genre = genre;
	}
	
	public long getDuration()
	{
		return duration;
	}
	
	public void setDuration(long duration)
	{
		this.duration = duration;
	}
	
	public double getRate()
	{
		return rate;
	}
	
	public void setRate(double rate)
	{
		this.rate = rate;
	}
	
	public List<Person> getCast()
	{
		return cast;
	}
	
	public void setCast(List<Person> cast)
	{
		this.cast = cast;
	}
	
	
	@Override
	public int getPrice()
	{
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
		for (Person person : cast)
		{
			total += person.getSalary();
		}
		return total;
	}
	
	
	
}
