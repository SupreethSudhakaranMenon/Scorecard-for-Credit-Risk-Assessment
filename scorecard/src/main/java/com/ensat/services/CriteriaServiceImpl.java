package com.ensat.services;

import com.ensat.entities.Criteria;
import com.ensat.repositories.CriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service 

public class CriteriaServiceImpl implements CriteriaService {
	
	private CriteriaRepository criteriaRepository;
	
	@Autowired
	public void setCriteriaRepository(CriteriaRepository criteriaRepository) {
		this.criteriaRepository = criteriaRepository;
	}
	
	@Override
	public Iterable<Criteria> listAllCriterias() {
		return criteriaRepository.findAll();
	}
	
	@Override
	public Criteria getCriteriaById(Integer id) {
		return criteriaRepository.findOne(id);
	}
	
	@Override
	public Criteria saveCriteria(Criteria criteria) {
		return criteriaRepository.save(criteria);
	}
	
	@Override
	public void deleteCriteria(Integer id) {
		criteriaRepository.delete(id);
	}

}
