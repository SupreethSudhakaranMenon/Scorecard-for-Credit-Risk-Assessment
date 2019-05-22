package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;



/**
 * Product entity.
 */
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Version
    private Integer version;
    //private String productId;
    private String characteristic;
    private String value;
    private String data;
    private String category;
    /*for another database table*/
    
    
   
    

    public Integer getId() {
        return id;
    }
    
    public Integer getVersion() {
        return version;
    }
    
   /* public String getProductId() {
        return productId;
    } */
    public String getData() {
        return data;
    }
    
    public String getValue() {
		return value;
	}
   
    public String getCharacteristic() {
		return characteristic;
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
    
    /*public void setProductId(String productId) {
        this.productId = productId;
    } */
    
    public void setData(String data) {
        this.data = data;
    }

	

	public void setCharacteristic(String characteristic) {
		this.characteristic = characteristic;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setCategory(String category) {
		this.category = category;
	}

	
	
	

	
	
}
