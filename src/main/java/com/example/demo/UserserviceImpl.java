package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class UserserviceImpl implements UserserviceInt{

    @Autowired
    MovieRepoImpl movieRepo;


    @Override
    public List<MovieImpl> getMovies() throws SQLException {
        return null;
    }

    @Override
    public List<MovieImpl> getSearched() {
        return null;
    }

    @Override
    public void createMovie(MovieImpl movie) throws SQLException {
        movieRepo.getMovies().add(movie);
        movieRepo.createMovie(movie);
    }

    @Override
    public void updateMovie(MovieImpl movie) {

    }

    @Override
    public void deleteMovie(int id) {

    }

    @Override
    public MovieImpl selectMovie(int id) {
        return null;
    }

    @Override
    public List<MovieImpl> searchMovie(String search) {
        return null;
    }

    @Override
    public List<MovieImpl> searchMovie(int id) {
        return null;
    }

    @Override
    public void clearSearch() {

    }
}
