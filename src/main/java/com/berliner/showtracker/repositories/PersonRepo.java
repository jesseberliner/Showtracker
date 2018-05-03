package com.berliner.showtracker.repositories;

import com.berliner.showtracker.models.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepo extends CrudRepository<Person,Long>{
}
