package com.ensat.services;

import com.ensat.entities.Scorecard;


public interface ScorecardService {

Iterable<Scorecard> listAllScorecards();

Scorecard get ScorecardById(Integer id);

Scorecard saveScorecard(Scorecard scorecard);

void deleteScorecard(Integer id);

	
}
