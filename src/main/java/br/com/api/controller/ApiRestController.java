package br.com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.model.response.InfoResponse;
import br.com.api.service.ApiRestService;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/api-rest")
@Tag(name = "Spring Rest Application", description = "This apis allow the consumer to get and post api rest")
public class ApiRestController {
	
	@Autowired
	private ApiRestService apiRestService;
	
	@GetMapping(path = "/info")
	@ResponseStatus(HttpStatus.OK)
	public InfoResponse getVersionInfo() throws Exception {
		return apiRestService.getInfo();
	}
	
}
