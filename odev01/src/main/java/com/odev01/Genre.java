package com.odev01;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Genre {


    @Column(name = "genre_Id") @Id @GeneratedValue
    private Long genre_id;


    @NotNull
    @Column(name = "genre_name")
    private String genre_name;

    public Genre(){};

    public Long getGenre_id() {
        return genre_id;
    }

    public void setGenre_id(Long genre_id) {
        this.genre_id = genre_id;
    }

    public String getGenre_name() {
        return genre_name;
    }

    public void setGenre_name(String genre_name) {
        this.genre_name = genre_name;
    }
}
