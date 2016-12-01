package Movies;

/**
 * Created by M.Ben_Roberts on 11/30/16.
 */

import console.Console;
import validation.NonEmptyString;
import validation.yOrN;

import java.util.ArrayList;

public class MovieApp {

    private static ArrayList<Movie> movies = new ArrayList();

    public static void main(String[] args) {
        String category;
        String title;
        String moreMovies;
        String anotherCategory;

        do {

            title = Console.getInputString("Enter movie title: ", new NonEmptyString());
            category = getCategory("Enter movie category (scifi, horror, drama, or animated): ");

            movies.add(new Movie(title, category));

            moreMovies = Console.getInputString("Would you like to enter another movie? (y/n)", new yOrN());

        }while("y".equalsIgnoreCase(moreMovies));

        do {

            category = getCategory("\nGet results by which category (scifi, horror, drama, or animated)? ");

            for (Movie film: movies) {

                if(film.getCategory().equalsIgnoreCase(category.trim())) {

                    System.out.println(film.getTitle());

                }
            }

            anotherCategory = Console.getInputString("Would you like to enter another category? (y/n)", new yOrN());

        } while("y".equalsIgnoreCase(anotherCategory));

    }

    private static String getCategory(String message){

        String userInput;
        boolean validAnswer;

        do {

            userInput = Console.getInputString(message, new NonEmptyString()).trim();
            validAnswer = userInput.equalsIgnoreCase("scifi") || userInput.equalsIgnoreCase("horror") || userInput.equalsIgnoreCase("drama") || userInput.equalsIgnoreCase("animated");

            if (!validAnswer){

                System.out.println("\nPlease enter scifi, horror, drama, or animated!\n");

            }

        }while(!validAnswer);

        return userInput;
    }
}
