package com.restdevice.restdevice.device;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceController {

	@Autowired
	DeviceService deviceService;
	
	@Autowired
	DeviceRepository deviceRepository;
	
	
}
