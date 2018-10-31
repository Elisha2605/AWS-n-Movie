package com.example.demo;

import java.sql.SQLException;
import java.util.List;


public interface MovieRepoInt {

    List<MovieImpl> getMovies() throws SQLException;

    MovieImpl createMovie(MovieImpl movie);
    void updateMovie(int id);
    void deleteMovie(int id);
    MovieImpl selectMovie(int id);
    List<MovieImpl> searchMovieTitle(String search);
    List<MovieImpl> searchMovieGenre(String search);
    List<MovieImpl> searchMovieId(int id);

}
