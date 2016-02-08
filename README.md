# Java-Task_of_Week10A

After you modified your Person class, please add a salary field to it. It's an integer number.
Create a class called Product. It is able to tell us how much money was the investment for the current product by getInvestment method, but there is a little problem: we cannot define how to calculate the investment, because it depends on the type of the product.
Create an interface, called Buyable. A product which is buyable has a price, so add a method getPrice(), which returns with an integer number.
The total investment of a movie can be calculated if you summarize the salary of each person of the cast.
A Game is a product and is buyable and it can be pre-ordered or not (boolean). People who pre-orders a game can get it 20% less price. The total investment of a game can be calculated if you summarize the salary of each person of the staff.
A Book is a product and has an author. The investment of a book is the salary of the author.
Create an IdGenerator class. It has a static generate method which gets a Product as a parameter and returns with a generated String which will be the unique identifier for the product. If the product is a Movie, the id should start with MOV. If the product is a Game, the id should start with GAM. If the product is a Book, the id should start with BOO.
Create a RentManager class which includes the main method. Create at least 2 instances of EVERY type of product and print out the investment of the current product. Write a method which gets a List of Buyable objects and returns with the total preferred income by summarizing the prices of the products in the parameter.
Person field in Product class means the person who rented the current product.

![Java exercise UML](http://lms.codecool.com/File/DownloadPicture-9b3cf72285c7e511a08500151788bf01/Medium?downloadName=movie2.jpg)
