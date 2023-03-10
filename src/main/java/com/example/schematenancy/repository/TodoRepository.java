package com.example.schematenancy.repository;

import com.example.schematenancy.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TodoRepository extends JpaRepository<ToDo, UUID> {

}
