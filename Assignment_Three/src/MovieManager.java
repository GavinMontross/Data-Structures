import java.io.*;
import java.util.*;

// Class to represent a Movie with name and year
class Movie {
    String movieName;
    int movieYear;

    // Constructor to initialize Movie
    public Movie(String movieName, int movieYear) {
        this.movieName = movieName;
        this.movieYear = movieYear;
    }
    // Added Override to properly use .contains() method in linkedList
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return movieYear == movie.movieYear && movieName.equalsIgnoreCase(movie.movieName);
    }
}

public class MovieManager {
    //Create a method to add movies to the list
    public static void addMoviesfromFile(String filename, LinkedList<Movie> movieList){
        try{
            Scanner in = new Scanner(new File(filename));
            while (in.hasNextLine()) {
                String movieName = in.nextLine().trim();
                if (in.hasNextLine()) {
                    int year = Integer.parseInt(in.nextLine().trim()); 
                    Movie movie = new Movie(movieName, year);
                    if(!movieList.contains(movie)){
                    movieList.add(movie);}
                }
            }
            }
            catch(FileNotFoundException e){
                System.out.println("File cannot be found.");
            }
    }
// Created Method to Print the movie list:
public static void printMergedMovieList(LinkedList<Movie> movieList){
    for (int i = 0; i < movieList.size()-1; i ++){
        System.out.print(movieList.get(i).movieName); 
        System.out.print(", ");
    }
    System.out.println(movieList.get(movieList.size()-1).movieName); // print last movie without a comma
}

// Created method to print oldest movie:
public static void printOldestMovie(LinkedList<Movie> movieList){
    Movie oldest = movieList.getFirst();
    for(Movie movie : movieList){
        if (movie.movieYear < oldest.movieYear){
            oldest = movie;
        }
    }
    System.out.println("Oldest movie: " + oldest.movieName + " (" + oldest.movieYear + ")");
}

// Created Method to print latest movie:
public static void printLatestMovie(LinkedList<Movie> movieList){
    Movie latest = movieList.getFirst();
    for(Movie movie : movieList){
        if (movie.movieYear > latest.movieYear){
            latest = movie;
        }
    }
    System.out.println("Latest movie: " + latest.movieName + " (" + latest.movieYear + ")");
}

//Created Method to remove all movies with "the"
public static void removeThes(LinkedList<Movie> movieList){
    for(int i = 0; i < movieList.size(); i ++){
        if(movieList.get(i).movieName.toLowerCase().contains("the")){  // Checking if movie name contains 'the' while ignoring case sensitivity
        movieList.remove(i);
        i --;
    }
    }
}


    public static void main(String[] args) {
        LinkedList<Movie> movieList = new LinkedList<>();
        addMoviesfromFile("Assignment_Three/movieListA.txt", movieList);
        addMoviesfromFile("Assignment_Three/movieListB.txt", movieList);

        // Task 1: Print Movie List
        printMergedMovieList(movieList);

        // Task 2: Print the oldest and the latest movie names:
        printOldestMovie(movieList);
        printLatestMovie(movieList);

        //Task 3: Remove movies with "the":
        removeThes(movieList);
        System.out.print("Removing all movies with 'the': ");
        printMergedMovieList(movieList);

        //Task 4: Print oldest after 1-3 are done:
        printOldestMovie(movieList);
    }
}
