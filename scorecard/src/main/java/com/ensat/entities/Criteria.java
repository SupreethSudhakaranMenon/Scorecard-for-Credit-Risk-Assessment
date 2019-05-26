package com.ensat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Version;


@Entity
public class Criteria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Version 
	private Integer version;
	
	
	
	
	private String datasource;
	private String sqlapi;
	private String dummykey;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
        this.id = id;
    }
	public Integer getVersion() {
		return version; 
	}
	public void setVersion(Integer version) {
        this.version = version;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getDatasource() {
		return datasource;
	}
	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}
	public String getDummykey() {
		return dummykey;
	}
	public void setDummykey(String dummykey) {
		this.dummykey = dummykey;
	}
	public String getSqlapi() {
		return sqlapi;
	}
	public void setSqlapi(String sqlapi) {
		this.sqlapi = sqlapi;
	}
	
}
