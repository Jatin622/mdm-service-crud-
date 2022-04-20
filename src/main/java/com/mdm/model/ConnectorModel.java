package com.mdm.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity 
@Table (name="connector_table")
public class ConnectorModel 	 {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer code;
	public String  Ip_address;
	public String host_name;
	public String user_name;
	public String password;
	public String database_name;
	public Boolean is_active;
	
	@OneToOne(cascade = CascadeType.ALL)

	public Source source;
	
	
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getIp_address() {
		return Ip_address;
	}
	public void setIp_address(String ip_address) {
		Ip_address = ip_address;
	}
	public String getHost_name() {
		return host_name;
	}
	public void setHost_name(String host_name) {
		this.host_name = host_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDatabase_name() {
		return database_name;
	}
	public void setDatabase_name(String database_name) {
		this.database_name = database_name;
	}
	public Boolean getIs_active() {
		return is_active;
	}
	public void setIs_active(Boolean is_active) {
		this.is_active = is_active;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	public ConnectorModel(Integer code, String ip_address, String host_name, String user_name, String password,
			String database_name, Boolean is_active, Source source) {
		
		this.code = code;
		Ip_address = ip_address;
		this.host_name = host_name;
		this.user_name = user_name;
		this.password = password;
		this.database_name = database_name;
		this.is_active = is_active;
		this.source = source;
	}
	public ConnectorModel() {
		
	}
	
	

	

}
