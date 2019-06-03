package com.ensat.services;

import com.ensat.entities.C_feature;
import com.ensat.repositories.C_featureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class C_featureServiceImpl implements C_featureService {

		private C_featureRepository c_featureRepository;
		
		@Autowired
		public void setCfeatureRepository(C_featureRepository c_featureRepository) {
			this.c_featureRepository = c_featureRepository;
		}
	
		@Override
		public Iterable<C_feature> listAllCfeatures() {
			return c_featureRepository.findAll();
		}
		
		@Override
		public C_feature getCfeatureById(Integer id) {
			return c_featureRepository.findOne(id);
		}
		
		@Override
		public C_feature saveCfeature(C_feature c_feature) {
			return c_featureRepository.save(c_feature);
		}
		
		@Override 
		public void deleteCfeature(Integer id) {
			c_featureRepository.delete(id);
		}
}
