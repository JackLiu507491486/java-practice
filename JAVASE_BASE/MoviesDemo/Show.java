package com.JAVASE_BASE.MoviesDemo;

public class Show {
    public static void main(String[] args) {
        Movie[] movies = new Movie[3];
        movies[0] = new Movie("长津湖","中国大陆","徐克","吴京");
        movies[1] = new Movie();
        movies[1].setName("Hello World");
        movies[1].setArea("American");
        movies[1].setDirectors("Jim");
        movies[1].setActors("Tom");
        movies[1].show();
        movies[0].show();
    }
}
