package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
public class Configuration {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
	
	@Version 
	private Integer version; 
	private String green;
	private String product;
	private String category;
	private String characteristic;
	private String amber;
	private String red;
	
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	
	public Integer getVersion() {
		return version; 
	}
	public String getGreen() {
		return green;
	}
	public String getProduct() {
		return product;
	}
	public String getCategory() {
		return category;
	}
	public String getCharacteristic() {
		return characteristic;
	}
	public String getAmber() {
		return amber;
	}
	public String getRed() {
		return red;
	}
	
	
	
	
	
	
	
	
	
	
		public void setId(Integer id) {
	        this.id = id;
	    }
	    public void setVersion(Integer version) {
	        this.version = version;
	    }
	    public void setGreen(String green) {
			this.green = green;
		}
	    public void setProduct(String product) {
			this.product = product;
	    }

		public void setCategory(String category) {
			this.category = category;
		}

		public void setCharacteristic(String characteristic) {
			this.characteristic = characteristic;
		}

		public void setAmber(String amber) {
			this.amber = amber;
		}

		public void setRed(String red) {
			this.red = red;
		}
		

		

		

		
}
