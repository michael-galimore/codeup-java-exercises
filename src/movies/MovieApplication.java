package movies;

import util.Input;

import java.util.Scanner;

public class MovieApplication {


    public static void main(String[] args) {
        boolean choosing = true;

        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit\n1 - view all movies\n" +
                    "2 - view movies in the animated category\n" +
                    "3 - view movies in the drama category\n" +
                    "4 - view movies in the horror category\n" +
                    "5 - view movies in the scifi category");


            Scanner scanner = new Scanner(System.in);
            int userDecision = scanner.nextInt();

            switch (userDecision) {
                case 1:
//                view all movies
                    Movie[] movies = MoviesArray.findAll();
                    for (int i = 0; i < movies.length; i++) {
                        System.out.println(movies[i].getName());
                    }
                    break;
                case 2:
//                view movies in the animated category
                    Movie[] all = MoviesArray.findAll();
                    for (int i = 0; i < all.length; i++) {
                        if (all[i].getCategory().equals("animated")) {
                            System.out.println(all[i].getName());
                        }
                    }
                    break;

                case 3:
//                view movies in the drama category
                    Movie[] mov = MoviesArray.findAll();
                    for (int i = 0; i < mov.length; i++) {
                        if (mov[i].getCategory().equals("drama")) {
                            System.out.println(mov[i].getName());
                        }
                    }
                    break;
                case 4:
//                view movies in the horror category
                    Movie[] movie = MoviesArray.findAll();
                    for (int i = 0; i < movie.length; i++) {
                        if (movie[i].getCategory().equals("horror")) {
                            System.out.println(movie[i].getName());
                        }
                    }
                    break;
                case 5:
//                view movies in the scifi category
                    Movie[] movee = MoviesArray.findAll();
                    for (int i = 0; i < movee.length; i++) {
                        if (movee[i].getCategory().equals("scifi")) {
                            System.out.println(movee[i].getName());
                            choosing = true;
                        }
                    }
                    break;
                case 0:

                    System.out.println("exiting program");
                    choosing = false;
            }


        } while(choosing);
    }
}