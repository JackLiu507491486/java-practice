package com.JAVASE_BASE.MoviesDemo;

public class Movie {
    private String name;
    private String area;
    private String directors;
    private String actors;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDirectors() {
        return directors;
    }

    public void setDirectors(String directors) {
        this.directors = directors;
    }

    public String getActors() {
        return actors;
    }

    public void setActors(String actors) {
        this.actors = actors;
    }

    Movie(){}

    Movie(String name,String area,String directors,String actors){
        setName(name);
        setArea(area);
        setDirectors(directors);
        setActors(actors);
    }

    public void show(){
        System.out.println("电影名称:" + getName());
        System.out.println("地区:" + getArea());
        System.out.println("导演:" + getDirectors());
        System.out.println("演员:" + getActors());
        System.out.println("------------------------------------------");
    }
}
