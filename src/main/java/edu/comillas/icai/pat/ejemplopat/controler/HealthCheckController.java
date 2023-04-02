/*******************************************************************************
 * Copyright (c) 2023 Universidad de Comillas ICAI.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the company
 * which accompanies this distribution
 *
 * Contributors:
 *     Universidad de Comillas - ICAI
 *******************************************************************************/

package edu.comillas.icai.pat.ejemplopat.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.comillas.icai.pat.ejemplopat.service.MyService;


@RestController

public class HealthCheckController {

	@Autowired
	MyService myService;
	
	
	@GetMapping("/gato")
	public Object gato() throws Exception {
		Object o = myService.getHealthCheck();
		if (o == null)
		{
			throw new Exception();
		}
		return o;
	}
}
