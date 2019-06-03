package com.ensat.services;

import com.ensat.entities.C_feature;

public interface C_featureService {

	Iterable<C_feature> listAllCfeatures(); 
	
	C_feature getCfeatureById(Integer id); 
	
	C_feature saveCfeature(C_feature c_feature);
	
	void deleteCfeature(Integer id);
	
}
