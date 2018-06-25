package com.pccth.testdb.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.pccth.testdb.service.GenAppealIdSevice;

@RestController
public class ConfigRest {
	@Autowired
	GenAppealIdSevice genAppealIdSevice;
	
	@GetMapping
    @RequestMapping(value="genAppealId/getAll", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getEchoModel() {
        return new Gson().toJson(genAppealIdSevice.findAll());
    }
}
