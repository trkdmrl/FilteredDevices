package com.restdevice.restdevice.device;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DeviceService {

	DeviceRepository deviceRepository;
	
	public DeviceService(DeviceRepository deviceRepository) {
		this.deviceRepository = deviceRepository;
	}
	
	public Device save(Device device) {
		return deviceRepository.save(device);
	}
	
	public Iterable<Device> save(List<Device> devices) {
		return deviceRepository.saveAll(devices);
	}
}
