package com.restdevice.restdevice;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.restdevice.restdevice.device.Device;
import com.restdevice.restdevice.device.DeviceService;

@SpringBootApplication
public class RestdeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestdeviceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(DeviceService deviceService) {
		return args -> {
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<Device>> typeReference = new TypeReference<List<Device>>() {};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/devices.json");
			
			try {
				List<Device> devices = mapper.readValue(inputStream, typeReference);
				deviceService.save(devices);
				System.out.println("Device saved!");
			} catch(IOException e) {
				System.out.println("Unable to save devices: "+ e.getMessage());
			}
		};
	}

}
