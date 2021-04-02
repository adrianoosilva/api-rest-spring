package br.com.api.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import br.com.api.model.response.InfoResponse;

@Component
public class ApiRestService {
	
	
	public InfoResponse getInfo() {
		return InfoResponse.builder()
				.version("1.0.0")
				.applicationName("Spring Rest API Platform")
				.dateTime(LocalDateTime.now())
				.build();
	}
	
}
