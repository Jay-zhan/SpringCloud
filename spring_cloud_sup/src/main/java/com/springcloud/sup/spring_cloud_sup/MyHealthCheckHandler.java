package com.springcloud.sup.spring_cloud_sup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;

@Component
public class MyHealthCheckHandler implements HealthCheckHandler {

	@Autowired
	private MyHealthIndicator halthIndicator;
	
	public InstanceStatus getStatus(InstanceStatus currentStatus) {
		Status status = halthIndicator.health().getStatus();
		if(status.equals(Status.UP)) {
			return InstanceStatus.UP;
		} else {
			return InstanceStatus.DOWN;
		}
	}

}
