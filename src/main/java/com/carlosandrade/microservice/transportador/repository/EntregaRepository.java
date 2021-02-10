package com.carlosandrade.microservice.transportador.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlosandrade.microservice.transportador.model.Entrega;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Long>{

}
