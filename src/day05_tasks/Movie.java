package day05_tasks;

public class Movie {
    //Task #8 - Movie
    //Create a class called Movie in your Practice_Programming project
    //and inside the day04_tasks package
    //Task:
    //create a main method
    //- Write the datatype you feel is most appropriate for
    //each variable.
    //- Create the following variables:
    //name,
    //genre,
    //duration,
    //release date,
    //rating(G, PG, R, etc..),
    //is a sequels or not,
    //rotten tomatoes rating (out of 100),
    //is on dvd.
    //- Print out the Movie information using concatenations
    //and print statements
    //------ Welcome to the Cinema ------
    //Tonight we are streaming "$movieName" which was
    //released on $releaseDate
    //This $genre movie got a $rottenTomatoesRating rating
    //on Rotten Tomatoes.
    //The rating is $rating and it runs for $duration hours.
    //This is a sequel $isSequel and is on dvd $isOnDvd.
    public static void main(String[] args) {
        String name = "Avatar";
        String genre = "Fantastic";
        byte duraction = 3;
        String releaseDdate = "12.12.22";
        char reating = 'R';
        boolean sequels = true;
        byte rating = 85;
        boolean dvd = false;
        System.out.println("\t\t\t\t\t------Welcome to the Cinema------"+"\nTonight we are stearming " + name + " which was  released on " + releaseDdate + "." + " \nThis " + genre + " movie got a " + reating + "rating  on Rotten Tomates. \nThe rating is" + rating + "and it runs for " + duraction + " hours.This is sequel " + sequels + " and is on dvd " + dvd + " .");
    }











}
