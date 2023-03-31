package com.JAVASE_PRO.collectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

class Movie{
    private String name;
    private double score;
    private String actors;

    public Movie(){}

    public Movie(String name, double score, String actors) {
        this.name = name;
        this.score = score;
        this.actors = actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", actors='" + actors + '\'' +
                '}';
    }
}
public class collectionDemo3 {
    public static void main(String[] args) {
        Collection<Movie> movies = new ArrayList();
        movies.add(new Movie("《123》",7.8,"1,2,3"));
        movies.add(new Movie("《456》",8.5,"4,5,6"));
        movies.add(new Movie("《789》",9.5,"7,8,9"));

        for (Movie movie : movies) {
            System.out.println(movie.toString());
        }
    }
}
