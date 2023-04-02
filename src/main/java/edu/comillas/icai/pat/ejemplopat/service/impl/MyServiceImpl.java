/*******************************************************************************
 * Copyright (c) 2023 Universidad de Comillas ICAI.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the company
 * which accompanies this distribution
 *
 * Contributors:
 *     Universidad de Comillas - ICAI
 *******************************************************************************/


package edu.comillas.icai.pat.ejemplopat.service.impl;

import org.springframework.stereotype.Service;
import edu.comillas.icai.pat.ejemplopat.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Service
public class MyServiceImpl implements MyService {

	@Override
	public Object getHealthCheck() {


		String url="https://api.thecatapi.com/v1/images/search";
		RestTemplate restTemplate = new RestTemplate();
		Object o=restTemplate.getForObject(url, Object.class);
		return o;
	}




	
}
