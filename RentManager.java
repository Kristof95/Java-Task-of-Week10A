package movieHandlerUpgrade;
import java.util.*;
import movieHandlerUpgrade.Movie.Genre;
//import movieHandlerUpgrade.Person.Gender;

public class RentManager
{	
	public static void main(String[] args)
	{
		Product movie_product_obj = new Movie(Genre.HORROR,22,5.5,null,5000);
		Movie movie_obj = new Movie(Genre.HORROR,22,5.5,null,5000);
		
		Product game_product_obj = new Game(true,null,5000);
		Game game_obj = new Game(true,null,5000);
		
		Product book = new Book(null);
		
//		Person author = new Person("Rami","Malek",Gender.MALE,100000);
//		author.setSalary(100500);
//		movie_obj.setPrice(50000);
//		game_obj.setPrice(50002);
		List<Buyable> buyableProducts = new ArrayList<Buyable>();
		buyableProducts.add(movie_obj);
		buyableProducts.add(game_obj);
	
		if(movie_product_obj instanceof Product)
		{
			System.out.println(movie_product_obj.getInvestment());
		}
		else if (game_product_obj instanceof Product)
		{
			System.out.println(game_product_obj.getInvestment());
		}
		else if (book instanceof Product)
		{
			System.out.println(book.getInvestment());
		}
	}
	
	public int priceOfTheProducts(List<Buyable>getListOfBuyables)
	{
		int total = 0;
		for (Buyable buyable : getListOfBuyables)
		{
			total += buyable.getPrice();
		}
		return total;
	}
}
