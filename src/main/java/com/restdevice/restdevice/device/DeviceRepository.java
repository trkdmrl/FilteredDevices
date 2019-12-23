package com.restdevice.restdevice.device;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface DeviceRepository extends PagingAndSortingRepository<Device, Long>,JpaSpecificationExecutor<Device>{

}
