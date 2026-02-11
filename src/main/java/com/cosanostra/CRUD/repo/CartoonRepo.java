package com.cosanostra.CRUD.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cosanostra.CRUD.model.Cartoon;

@Repository
public interface CartoonRepo extends JpaRepository<Cartoon,Integer>{

}
