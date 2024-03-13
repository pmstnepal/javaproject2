package com.it.restapicontroller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.it.main.restapicontroller.DaoLayerDTO;
import com.it.main.restapicontroller.DaoLayerWrapperDTO;

@RestController
@RequestMapping("/v2")
public class RestApiController {
	 @Autowired 
	 private RestTemplate restTemplate;
	
	@GetMapping("/kalldata")
	public DaoLayerWrapperDTO geDto() {
		
		HttpHeaders getHeaders=new HttpHeaders();
		getHeaders.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		HttpEntity<DaoLayerDTO> entity=new HttpEntity<>(getHeaders);
		List<DaoLayerDTO> daoLayerDTOs= new ArrayList<>();
		
			ResponseEntity<? extends List>  result = restTemplate.exchange("http://PMST-NEPAL"+"/api/v1/alldata",HttpMethod.GET,entity,daoLayerDTOs.getClass());
			List<?> dList=(List<?>) result.getBody();
			DaoLayerWrapperDTO daoLayerWrapperDTO=new DaoLayerWrapperDTO();
			daoLayerWrapperDTO.setCode("1254");
			daoLayerWrapperDTO.setMessage("Data is fetched");
			daoLayerWrapperDTO.setSignup(dList);
		return daoLayerWrapperDTO;
		
		
   
	}

}
