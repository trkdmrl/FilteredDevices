package com.restdevice.restdevice.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter/v1")
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	
	@Autowired
	DeviceRepository deviceRepository;
	
	@GetMapping("/devices")
	public Page<Device> getDevices (DeviceSpec deviceSpec, Pageable pageable) {
         return deviceRepository.findAll(deviceSpec, pageable);
	}
}
