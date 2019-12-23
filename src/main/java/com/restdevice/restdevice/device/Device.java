package com.restdevice.restdevice.device;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Device {

	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id;
	
	private String brand;
	
	private String model;
	
	private String os;
	
	private String osVersion;
}
