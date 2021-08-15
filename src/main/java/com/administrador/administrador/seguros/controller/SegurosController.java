package com.administrador.administrador.seguros.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.seguros.InsuranceSummary;
import com.administrador.administrador.seguros.service.InsuranceService;
import com.administrador.administrador.user.User;

@RestController
public class SegurosController {
	
	@Autowired
	InsuranceService insuranceService;
	
	@PostMapping(value = "insurance/add")
	public ResponseEntity<Void> addInsurance(@RequestBody Insurance insurance){
		insuranceService.addInsurance(insurance);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@DeleteMapping(value = "insurance/delete")
	public ResponseEntity<Void> deleteInsurance(@RequestParam Integer insuranceId){
		insuranceService.deleteInsurance(insuranceId);
		return new ResponseEntity<>( HttpStatus.OK);
	}
	
	@GetMapping(value = "insurance/show/all")
	public ResponseEntity<List<InsuranceSummary>> showInsurancesByUser(@RequestParam Integer userId){
		List<InsuranceSummary> insurances = insuranceService.showInsurancesByUser(userId);
		return new ResponseEntity<>(insurances, HttpStatus.OK);
	}
	
	@GetMapping(value = "insurance/show")
	public ResponseEntity<InsuranceSummary> showInsuranceById(@RequestParam Integer insuranceId){
		InsuranceSummary insurance = insuranceService.showInsuranceById(insuranceId);
		return new ResponseEntity<>(insurance, HttpStatus.OK);
	}

}
