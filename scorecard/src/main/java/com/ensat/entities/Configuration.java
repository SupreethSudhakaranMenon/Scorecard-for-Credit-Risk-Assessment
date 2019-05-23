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
	private String product;
	private String category;
	private String characteristic;
	private String hello;
	private String hola;
	private String value;
	

	
	
	

	
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}
	
	public Integer getVersion() {
		return version; 
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
	public String getHello() {
		return hello;
	}
	
	
	
	
	
	
	
	
	
	
	
	
		public void setId(Integer id) {
	        this.id = id;
	    }
	    public void setVersion(Integer version) {
	        this.version = version;
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
		
		
		public void setHello(String hello) {
			this.hello = hello;
		}

		public String getHola() {
			return hola;
		}

		public void setHola(String hola) {
			this.hola = hola;
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		
		

		
		

		
		
		
		
		

		

		

		
}
