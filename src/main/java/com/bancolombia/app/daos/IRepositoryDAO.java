package com.bancolombia.app.daos;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.bancolombia.app.entities.Articulo;

public interface IRepositoryDAO extends CrudRepository<Articulo, Integer> {
	/* select, insert, update, delete*/
	
	Optional<Articulo>findByName( String name);

}
