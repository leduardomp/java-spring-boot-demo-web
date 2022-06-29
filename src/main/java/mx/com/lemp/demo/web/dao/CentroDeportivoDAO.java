package mx.com.lemp.demo.web.dao;

import org.springframework.data.repository.CrudRepository;

import mx.com.lemp.demo.web.model.CentroDeportivo;

public interface CentroDeportivoDAO extends CrudRepository<CentroDeportivo, Long> {

}
