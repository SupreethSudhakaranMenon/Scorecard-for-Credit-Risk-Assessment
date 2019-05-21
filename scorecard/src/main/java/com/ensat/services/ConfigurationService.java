package com.ensat.services;

import com.ensat.entities.Configuration;

public interface ConfigurationService {
	
	Iterable<Configuration> listAllConfigurations();
	
	Configuration getConfigurationById(Integer id); 
	
	Configuration saveConfiguration(Configuration configuration); 
	
	void deleteConfiguration(Integer id);

}
