package com.mycompany.dvdstore.repository;

import com.mycompany.dvdstore.entity.Movie;

import java.io.FileWriter;
import java.io.IOException;

public class GoLiveMovieRepository implements  IMovieRepository{
    FileWriter writer;
    public void add(Movie movie){
        try {
            writer = new FileWriter("/Users/sg-openr/Desktop/JAVA/movies.txt",true);
            writer.write(movie.getTitle() + ";" + movie.getGenre() + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
