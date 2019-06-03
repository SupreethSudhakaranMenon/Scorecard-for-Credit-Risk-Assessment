package com.ensat.services;

import com.ensat.entities.C_feature;

public interface C_featureService {

	Iterable<C_feature> listAllC_features(); 
	
	C_feature getC_featureById(Integer id); 
	
	C_feature saveC_feature(C_feature c_feature);
	
	void deleteC_feature(Integer id);
	
}
