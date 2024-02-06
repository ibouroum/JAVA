package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.GoLiveMovieRepository;
import com.mycompany.dvdstore.repository.IMovieRepository;
import com.mycompany.dvdstore.repository.MovieRepository;

public class MovieService implements IMovieService {
    IMovieRepository movieRepositoryInterface;
    public void registerMovie(Movie movie){
//        GoLiveMovieRepository movieRepository = new GoLiveMovieRepository();
        movieRepositoryInterface.add(movie);
    }
}
