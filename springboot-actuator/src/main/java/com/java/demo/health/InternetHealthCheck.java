package com.java.demo.health;

import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthCheck implements HealthIndicator{

	
	private static final Logger log = LoggerFactory.getLogger(InternetHealthCheck.class);

	@Override
	public Health health() {
		
		Health health=checkInternet()==true?Health.up().withDetail("Success code", "Internet is active").build()
				:Health.down().withDetail("Error code", "Internet is inactive").build();
		
		log.info("response : "+health);
		return health ;
	}
	
	private boolean checkInternet() {
		
		boolean flag=false;
		try {
			
			URL uri=new URL("https://google.com");
			URLConnection connection=uri.openConnection();
			connection.connect();
			flag=true;
		}catch (Exception e) {
			flag=false;
		}
		return flag;
	}

}
