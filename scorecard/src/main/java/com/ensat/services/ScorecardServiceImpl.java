package com.ensat.services;

import com.ensat.entities.Scorecard;
import com.ensat.repositories.ScorecardRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScorecardServiceImpl implements ScorecardService {
	
	private ScorecardRepository scorecardRepository;
	
	@Autowired
	public void setScorecardRepository(ScorecardRepository scorecardRepository) {
		this.scorecardRepository = scorecardRepository;
	}
	
	@Override
	public Iterable<Scorecard> listAllScorecards() {
		return scorecardRepository.findAll();
	}
	
	@Override
	public Scorecard getScorecardById(Integer id) {
		return scorecardRespository.findOne(id);
	}
	
	@Override
	public Scorecard saveScorecard(Scorecard scorecard) {
		return scorecardRepository.save(scorecard);
	}
	
	@Override
	public void deleteScorecard(Integer id) {
		scorecardRepository.delete(id);
	}
}
