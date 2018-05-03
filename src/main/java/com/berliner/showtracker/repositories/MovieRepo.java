package com.berliner.showtracker.repositories;

import com.berliner.showtracker.models.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepo extends CrudRepository<Movie,Long> {
}
