package com.administrador.administrador.seguros.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.administrador.administrador.seguros.Insurance;
import com.administrador.administrador.seguros.InsuranceSummary;
import com.administrador.administrador.seguros.enums.CategoriaSeguro;
import com.administrador.administrador.seguros.repository.InsuranceRepository;
import com.administrador.administrador.seguros.service.InsuranceService;

@Service
public class InsuranceServiceImpl implements InsuranceService {
	
	@Autowired
	InsuranceRepository insuranceRepository;

	@Override
	public void addInsurance(Insurance insurance) {
		insuranceRepository.add(insurance);	
	}

	@Override
	public void deleteInsurance(Integer insuranceId) {
		insuranceRepository.delete(insuranceId);
		
	}

	@Override
	public List<InsuranceSummary> showInsurancesByUser(Integer userId) {
		List<Insurance> insuranceList = insuranceRepository.showInsurancesByUser(userId);
		return summarizeInsuranceList(insuranceList);
				
	}

	@Override
	public InsuranceSummary showInsuranceById(Integer userId) {
		Insurance insurance = insuranceRepository.showInsurancesById(userId);
		return summarizeInsurance(insurance);
	}
	
	private List<InsuranceSummary> summarizeInsuranceList(List<Insurance> insuranceList) {
		List<InsuranceSummary> insuranceSummaryList = new ArrayList<InsuranceSummary>();
		for(int i = 0; i < insuranceList.size(); i++) {
			insuranceSummaryList.add(summarizeInsurance(insuranceList.get(i)));
		}
		return insuranceSummaryList;
	}

	private InsuranceSummary summarizeInsurance(Insurance insurance) {
		return new InsuranceSummary(
				insurance.getNombreAseguradora(),
				insurance.getCategoriaSeguro(), 
				insurance.getCantidadSeguro());
	}

}
