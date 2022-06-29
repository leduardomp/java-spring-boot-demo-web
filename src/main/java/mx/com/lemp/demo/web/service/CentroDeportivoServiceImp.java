package mx.com.lemp.demo.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import mx.com.lemp.demo.web.commons.GenericServiceImp;
import mx.com.lemp.demo.web.dao.CentroDeportivoDAO;
import mx.com.lemp.demo.web.model.CentroDeportivo;

@Service
public class CentroDeportivoServiceImp extends GenericServiceImp<CentroDeportivo, Long> implements CentroDeportivoService{

	@Autowired
	private CentroDeportivoDAO centroDeportivoDAO;
	
	@Override
	public CrudRepository<CentroDeportivo, Long> getDao() {
		return centroDeportivoDAO;
	}

}
