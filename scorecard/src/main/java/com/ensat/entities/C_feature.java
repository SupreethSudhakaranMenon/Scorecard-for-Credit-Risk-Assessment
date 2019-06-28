package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;

@Entity
public class C_feature {

	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;

	    @Version
	    private Integer version;
	    private String characteristic;
	    private String value;
	    private String data;
	    private String category;
	    private String status;
	    private String feature;




	public Integer getId() {
	        return id;
	    }
	    
	    public Integer getVersion() {
	        return version;
	    }
	    
	    public String getData() {
	        return data;
	    }
	    
	    public String getValue() {
			return value;
		}
	   
	    public String getCharacteristic() {
			return characteristic;
		}

		public String getFeature() {
			return feature;
		}

	    public String getCategory() {
			return category;
		}

	    
	    public void setId(Integer id) {
	        this.id = id;
	    }
	    public void setVersion(Integer version) {
	        this.version = version;
	    }
	    
	    
	    public void setData(String data) {
	        this.data = data;
	    }


		public void setCharacteristic(String characteristic) {
			this.characteristic = characteristic;
		}

		public void setFeature(String feature) {
			this.feature = feature;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		
}
