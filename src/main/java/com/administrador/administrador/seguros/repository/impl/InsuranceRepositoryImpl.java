package com.administrador.administrador.seguros.repository.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.seguros.InsuranceSummary;
import com.administrador.administrador.seguros.repository.InsuranceRepository;
import com.administrador.administrador.user.User;

@Repository
public class InsuranceRepositoryImpl implements InsuranceRepository{
	
	Integer nextId = 1;
	
	private Map<Integer, Insurance> insuranceMap = new HashMap<>();
	
	@Override
	public void add(Insurance insurance) {
		insurance.setId(nextId);
		insuranceMap.put(nextId, insurance);
		nextId = nextId + 1;
	}

	@Override
	public void delete(Integer insuranceId) {
		insuranceMap.remove(insuranceId);
	}

	@Override
	public List<Insurance> showInsurancesByUser(Integer userId) {
		List<Insurance> insurances = new ArrayList<Insurance>(insuranceMap.values());
		insurances = insurances
			    .stream()
			    .filter(x -> !x.getUserId().equals(userId))
			    .collect(Collectors.toList());
		return insurances;
	}

	@Override
	public Insurance showInsurancesById(Integer insuranceId) {
		return insuranceMap.get(insuranceId);
	}

}
