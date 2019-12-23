package com.restdevice.restdevice.device;

import org.springframework.data.jpa.domain.Specification;

import net.kaczmarzyk.spring.data.jpa.domain.Equal;
import net.kaczmarzyk.spring.data.jpa.web.annotation.And;
import net.kaczmarzyk.spring.data.jpa.web.annotation.Spec;


@And({
    @Spec(path = "brand", spec = Equal.class),
    @Spec(path = "model", spec = Equal.class),
    @Spec(path = "osVersion", spec = Equal.class)
})
public interface DeviceSpec extends Specification<Device>{

}
