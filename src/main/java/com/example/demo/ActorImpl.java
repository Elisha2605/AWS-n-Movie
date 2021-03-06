package com.example.demo;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ActorImpl implements ActorInt{

    private String name;
    private List<MovieImpl> actsIn;
    private int id;

    @Override
    public String toString() {
        return "ActorImpl{" +
                "name='" + name + '\'' +
                ", actsIn=" + actsIn +
                ", id=" + id +
                '}';
    }

    public ActorImpl(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public ActorImpl() {
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public List<MovieImpl> getMoviesIn() {
        return null;
    }

    @Override
    public int getId() {
        return id;
    }
}
