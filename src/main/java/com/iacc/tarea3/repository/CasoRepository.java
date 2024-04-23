package com.iacc.tarea3.repository;

import com.iacc.tarea3.model.Caso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasoRepository extends CrudRepository<Caso, Integer> {

}
