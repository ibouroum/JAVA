package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.IMovieService;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {
    IMovieService movieServiceInterface;
    public void addUsingConsole(){
        System.out.println( "What is the movie title?" );
        Scanner scanner=new Scanner(System.in);
        String title=scanner.nextLine();
        System.out.println( "What is the movie genre?" );
        String genre=scanner.nextLine();
        Movie movie=new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
//        MovieService movieService=new MovieService();
        movieServiceInterface.registerMovie(movie);
    }
}
