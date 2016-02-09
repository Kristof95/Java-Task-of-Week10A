package movieHandlerUpgrade;
import java.util.*;
import movieHandlerUpgrade.Movie.Genre;
//import movieHandlerUpgrade.Person.Gender;
import movieHandlerUpgrade.Person.Gender;

public class RentManager
{	
	public static void main(String[] args)
	{
		RentManager rm = new RentManager();
		
		Person author = new Person("Rami","Malek",Gender.MALE,230);
		Person author1 = new Person("Abdul","Mahri",Gender.MALE,100);
		Person author2 = new Person("Rakesh","Mahanti",Gender.MALE,145);
			
		List<Person> person = new ArrayList<>();
		person.add(author);
		person.add(author1);
		person.add(author2);
		
		Game game_obj = new Game(true,person,90);
		Game game_obj_2 = new Game(false,person,80);
		
		Movie movie_obj = new Movie(Genre.HORROR,22,5.5,person,70);
		Movie movie_obj_2 = new Movie(Genre.COMEDY,26,5.5,person,60);
		movie_obj.title = "Matrix";
		movie_obj_2.title = "A Cserépkályha visszatér";
		
		Book book_obj = new Book(author);
		Book book_obj_2 = new Book(author1);

		System.out.println(author.getFirstName() + " " + author.getLastName() + " " + "Author salary:" + author.getSalary());
		System.out.println(author1.getFirstName() + " " + author1.getLastName() + " " + "Author salary:" + author1.getSalary());
		System.out.println(author2.getFirstName() + " " + author2.getLastName() + " " + "Author salary:" + author2.getSalary());
		
		System.out.println("Movie price:" + movie_obj.getPrice() + " " + "Movie title:" +movie_obj.getTitle() + " " + "Movie ID:" + movie_obj.id);
		System.out.println("Movie price:" + movie_obj_2.getPrice() + " " + "Movie title:" +movie_obj_2.getTitle()+ " " + "Movie ID:" + movie_obj_2.id);
		
		System.out.println("Game price:"+game_obj.getPrice());
		System.out.println("Game price:"+game_obj_2.getPrice());
		System.out.println("Game investment:"+game_obj.getInvestment());
		
		System.out.println("Book price on PHP:"+book_obj.getInvestment());
		System.out.println("Book price on Android Studio:"+book_obj_2.getInvestment());
		
		List<Buyable> buyableProducts = new ArrayList<Buyable>();
		buyableProducts.add(movie_obj);
		buyableProducts.add(game_obj);	
		buyableProducts.add(game_obj_2);	
		
		System.out.println("Price of buyable products:"+rm.priceOfTheProducts(buyableProducts));
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
