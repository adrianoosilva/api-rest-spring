package br.com.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigurationBean {
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
