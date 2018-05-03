package com.berliner.showtracker.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long s_id;

    private String s_name;

    private String s_genre;

    private String s_summary;

    private int s_seasons;

    private int s_episodes;

    private int s_startYear;

    private int s_endYear;

    private boolean s_isAiring;

}
