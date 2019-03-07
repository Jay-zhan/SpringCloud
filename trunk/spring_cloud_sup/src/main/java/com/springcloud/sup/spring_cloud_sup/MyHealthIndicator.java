package com.springcloud.sup.spring_cloud_sup;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class MyHealthIndicator implements HealthIndicator {

	public Health health() {
		if(PoliceController.canVisitDb) {
			return new Health.Builder(Status.UP).build();
		} else {
			return new Health.Builder(Status.DOWN).build();
		}
	}

}
