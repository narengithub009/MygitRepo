package com.java.demo.endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "springboot",enableByDefault = true)
public class MyEndPoint {
	
	private static final Logger log = LoggerFactory.getLogger(MyEndPoint.class);

	private MyEndpointResponse endpointResponse;
	@ReadOperation
	public MyEndpointResponse customEndpoint() {
		
		endpointResponse = new MyEndpointResponse(1212, "Spring boot tutorial", "Active");
		log.info("response : "+endpointResponse.getId()+"  "+endpointResponse.getName()+"  "+endpointResponse.getStatus());
		return endpointResponse;
	}
	
}

class MyEndpointResponse{
	private int id;
	private String name;
	private String status;
	
	public MyEndpointResponse() {
		// TODO Auto-generated constructor stub
	}

	public MyEndpointResponse(int id, String name, String status) {
		super();
		this.id = id;
		this.name = name;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}