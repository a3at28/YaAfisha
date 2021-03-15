package tech.itpark.domain;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Movie {
    private long id;
    private double rating;
    private String image;
    private String name;
    private long date;

}
