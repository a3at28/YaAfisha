package tech.itpark;

import tech.itpark.domain.Movie;
import tech.itpark.manager.MovieManager;

public class Main {
    public static void main(String[] args) {
        MovieManager manager = new MovieManager();

        manager.add(new Movie(1,7.1,"https//...","Пара из будущего",1615804832));
        manager.add(new Movie(2,7.8,"https//...","Райя и последний дракон",1615804832));
        manager.add(new Movie(3,7.3,"https//...","Батя",1615804832));

    }
}
