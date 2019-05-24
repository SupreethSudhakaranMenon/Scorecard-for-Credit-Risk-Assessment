package com.ensat.services;


import com.ensat.entities.Criteria;


public interface CriteriaService {

Iterable<Criteria> listAllCriterias();
	
	Criteria getCriteriaById(Integer id); 
	
	Criteria saveCriteria(Criteria criteria); 
	
	void deleteCriteria(Integer id);
	
}
