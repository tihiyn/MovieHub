package ru.mts.springsecurity.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mts.springsecurity.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
}
