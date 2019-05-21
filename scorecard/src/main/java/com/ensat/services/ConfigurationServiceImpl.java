package com.ensat.services;

import com.ensat.entities.Configuration;
import com.ensat.repositories.ConfigurationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConfigurationServiceImpl implements ConfigurationService {

	private ConfigurationRepository configurationRepository; 
	
	@Autowired
	public void setConfigurationRepository(ConfigurationRepository configurationRepository) {
		this.configurationRepository = configurationRepository; 
	}
	
	@Override 
	public Iterable<Configuration> listAllConfigurations() {
		return configurationRepository.findAll(); 
	}
	
	@Override
    public Configuration getConfigurationById(Integer id) {
        return configurationRepository.findOne(id);
    }

    @Override
    public Configuration saveConfiguration(Configuration configuration) {
        return configurationRepository.save(configuration);
    }

    @Override
    public void deleteConfiguration(Integer id) {
        configurationRepository.delete(id);
    }
}
